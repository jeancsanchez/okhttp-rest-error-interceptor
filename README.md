[![](https://jitpack.io/v/jeancsanchez/okhttp-rest-error-interceptor.svg)](https://jitpack.io/#jeancsanchez/okhttp-rest-error-interceptor)

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
Add it in your root build.gradle at the end of repositories:
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```

Add the dependency
```groovy
	dependencies {
	        implementation 'com.github.jeancsanchez:okhttp-rest-error-intercepto:{latest version}'
	}
```
