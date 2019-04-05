[![](https://jitpack.io/v/jeancsanchez/okhttp-rest-error-interceptor.svg)](https://jitpack.io/#jeancsanchez/okhttp-rest-error-interceptor)

Rest Error Interceptor
===================
This will intercept the codes responses and throw the proper exception. </br>

Example
--------

```kotlin
Try {
	repository.makeRestRequest()
	
} catch (throwable: Throwable){
	if(throwable is Unauthorizad){
		// Make login again.
	}
}
```

How to
------

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
	        implementation 'com.github.jeancsanchez:okhttp-rest-error-interceptor:{latest version}'
	}
```
