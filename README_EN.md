# SharedPreferencesHelper
Easy,powrful!
![API](https://img.shields.io/badge/API-8%2B-brightgreen.svg?style=flat)
# Why do we choose SharedPreferencesHelper?
<ul>
 	<li>Small</li>
 	<li>Fully functions</li>
 	<li>Stable and fast</li>
 	<li>Concise</li>
</ul>

### Gradle
```groovy
compile 'com.peter1303.SharedPreferencesHelper'
```
Supported functions:

|  Data type  |                 Methods                 |
| ----------- |:---------------------------------------:|
| String      | save(String tag, String str);           |
| int         | save(String tag, int value);            |
| float       | save(String tag, float value);          |
| boolean     | save(String tag, boolean value);        |
| long        | save(String tag, long value);           |
| StringSet   | save(String tag, Set<String> value);    |

# Methods:
## 1.Init. SharedPreferencesHelper
```java
private SharedPreferencesHelper sharedPreferencesHelper = null;
```
### Default init.(Use the package name of application)
```java
sharedPreferencesHelper = new SharedPreferencesHelper(Context context);
```
### Init(Custom name)
```java
sharedPreferencesHelper = new SharedPreferencesHelper(Context context, String name);
```
### Init.(Custom name and save mode)
```java
sharedPreferencesHelper = new SharedPreferencesHelper(Context context, int mode, String name);
```
## 2.Mothods
### Very concise,doesn't it?
```java
sharedPreferencesHelper.save();
```
## 3.Data
### Delete a data.
```java
sharedPreferencesHelper.delete(String tag);
```
### Clear all data.
```java
sharedPreferencesHelper.clear();
```
## 4.Others
### This lib. supports reverse boolean value and save it.
```java
sharedPreferencesHelper.saveReverseBoolean(String tag, boolean defultValue);
```
### If your application needs record launch times(Call one then save once)
```java
sharedPreferencesHelper.recordLaunchTimes();
```
### Gets the times of launching times.
```java
sharedPreferencesHelper.getLaunchTimes();
```
# If you use the library, be sure to abide by the treaty.
