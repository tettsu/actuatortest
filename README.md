# actuator test

```
curl localhost:9000/hello-world
curl localhost:9001/actuator/health
```

# redis startup

```
redis-server redis.windows.conf
```

# redis test

## add

```
access to
 http://localhost:9000/redis/add?key=city&value=tokyo
```

## get

```
access to
 http://localhost:9000/redis/get?key=city
```
