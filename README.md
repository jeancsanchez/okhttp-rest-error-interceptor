[![](https://jitpack.io/v/jeancsanchez/okhttp-rest-error-interceptor.svg)](https://jitpack.io/#jeancsanchez/okhttp-rest-error-interceptor)

Rest Error Interceptor
===================

This interceptor provides an easy way to handle the most common REST HTTP status code as exceptions.

Example
--------

```kotlin
try {
    repository.makeRestRequest()
} catch (throwable: Throwable) {
    when(throwable) {
        BadRequest -> { } // Handle the bad request status code
        InternalServerError -> {  } // Handle the internal server error status code
        Unauthorized -> {  } // Handle the unauthorized status code
    }
}
```

How to
------

```kotlin
val errorInterceptor = RestErrorInterceptor()
val client = OkHttpClient.Builder()
    .addInterceptor(errorInterceptor)
    .build()
```

Download
--------
1- Add the Jitpack Repository in your root build.gradle file:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
  ```

2- Add the dependency in your project-level build.gradle file:

```groovy
dependencies {
    implementation 'com.github.jeancsanchez:okhttp-rest-error-interceptor:{latest version}'
}
```