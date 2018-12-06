# Micronaut Lambda Function sample

please see http://guides.micronaut.io/micronaut-function-aws-lambda/guide/index.html

handler name is "io.micronaut.function.aws.MicronautRequestStreamHandler"

## Deploy

+ `./gradlew shadowJar`
+ deploy jar file to lambda
+ set hander name "io.micronaut.function.aws.MicronautRequestStreamHandler"

## Performance 

### 128 MB Memory

It doesn't work.
OutOfMemoryErorr raised after seconds.

```
{
  "errorMessage": "Metaspace",
  "errorType": "java.lang.OutOfMemoryError"
}
```

### 256 MB Memory

ColdStart 13s

```
START RequestId: 04a7dc52-f911-11e8-a7f9-f3fcefb28860 Version: $LATEST
END RequestId: 04a7dc52-f911-11e8-a7f9-f3fcefb28860
REPORT RequestId: 04a7dc52-f911-11e8-a7f9-f3fcefb28860	Duration: 13555.93 ms	Billed Duration: 13600 ms 	Memory Size: 256 MB	Max Memory Used: 89 MB	
```

Hot Start 500ms

```
START RequestId: 4b55ed3b-f912-11e8-9383-7d95168f3155 Version: $LATEST
END RequestId: 4b55ed3b-f912-11e8-9383-7d95168f3155
REPORT RequestId: 4b55ed3b-f912-11e8-9383-7d95168f3155	Duration: 508.91 ms	Billed Duration: 600 ms 	Memory Size: 256 MB	Max Memory Used: 88 MB	
```

### 512 MB Memory

Cold Start 6.6 s

```
START RequestId: a8b99eb4-f910-11e8-8e64-61bbe3230d65 Version: $LATEST
END RequestId: a8b99eb4-f910-11e8-8e64-61bbe3230d65
REPORT RequestId: a8b99eb4-f910-11e8-8e64-61bbe3230d65	Duration: 6628.65 ms	Billed Duration: 6700 ms 	Memory Size: 512 MB	Max Memory Used: 88 MB	

```

Hot Start 125 ms

```
START RequestId: c307ef4e-f910-11e8-8ed3-0d0158332656 Version: $LATEST
END RequestId: c307ef4e-f910-11e8-8ed3-0d0158332656
REPORT RequestId: c307ef4e-f910-11e8-8ed3-0d0158332656	Duration: 125.27 ms	Billed Duration: 200 ms 	Memory Size: 512 MB	Max Memory Used: 90 MB	
```



