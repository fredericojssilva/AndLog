# AndLog
Easier Log for Android

####Without AndLog
```java
class CoolClass{
	private final static String TAG = "CoolClass";

	public void doThings(){
		Log.d(TAG, "doThings() called");
		
		Log.d(TAG,"3 things done");
	}

	public void wowMethod(){
		Log.d(TAG, "woow");
		Log.d(TAG, "woow2");
		Log.d(TAG, "woow3");
		
		Log.e(TAG, "Error loading woow things");
	}
}
```
####With AndLog
```java
class CoolClass{
	public void doThings(){
		AndLog.hereIam();
		AndLog.d("3 things done");
	}

	public void wowMethod(){
		AndLog.d("woow", "woow2", "woow3");
		
		AndLog.e("Error loading woow things", new Exception("Error"))
	}
}
```


##Install

**Gradle:**

```
compile 'net.fredericosilva:andlog:1.1.0'
```
##License
```
Copyright 2015 Frederico Silva

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
