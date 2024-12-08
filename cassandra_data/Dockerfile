FROM cassandra:latest

# 설치 명령 추가
RUN apt-get update && apt-get install -y gawk && rm -rf /var/lib/apt/lists/*

# Cassandra 사용자 설정 및 기타 설정
#RUN groupadd -r cassandra && useradd -r -g cassandra cassandra
#RUN chown -R cassandra:cassandra /var/lib/cassandra /var/log/cassandra /etc/cassandra

# Cassandra 사용자로 실행
USER cassandra

# 기본 명령어
ENTRYPOINT ["./entrypoint.sh"]