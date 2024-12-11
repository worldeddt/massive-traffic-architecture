FROM cassandra:latest

# Update package list and install gawk
RUN apt-get update && apt-get install -y gawk && rm -rf /var/lib/apt/lists/*

# Cassandra 작업 사용자 설정
#RUN chown -R cassandra:cassandra /var/lib/cassandra /var/log/cassandra /etc/cassandra

# Cassandra 사용자로 실행
USER cassandra

# 기본 명령어 실행
CMD ["cassandra", "-f"]
