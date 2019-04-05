Rest Error Interceptor
===================

```java
RestErrorInterceptor errorInterceptor = new RestErrorInterceptor();
OkHttpClient client = new OkHttpClient.Builder()
  .addInterceptor(errorInterceptor)
  .build();
```

Download
--------
Gradle
```groovy
implementation ':(insert latest version)'
```
