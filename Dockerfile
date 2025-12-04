# Dockerfile
# 使用 Java 21 官方镜像
FROM openjdk:21-slim AS builder

# 安装 Maven（手动控制版本）
RUN apt-get update && apt-get install -y maven && apt-get clean

WORKDIR /app

# 复制项目文件
COPY pom.xml .
COPY src ./src

# 构建应用 - 完全控制 Maven 命令
RUN mvn clean package \
    -DskipTests \
    -Dmaven.test.skip=true \
    -Dcheckstyle.skip=true \
    -Dspotbugs.skip=true \
    -Djacoco.skip=true \
    -Denforcer.skip=true \
    -Dmaven.javadoc.skip=true

# 运行阶段
FROM openjdk:21-slim
WORKDIR /app

# 复制构建好的应用
COPY --from=builder /app/target/*.jar app.jar

# 创建必要的目录
RUN mkdir -p /data/uploads && chmod 755 /data/uploads

# 健康检查
HEALTHCHECK --interval=30s --timeout=3s --retries=3 \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]