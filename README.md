# SharedPreferencesHelper
容易、强大的 SharedPreferencesHelper
![API](https://img.shields.io/badge/API-8%2B-brightgreen.svg?style=flat)
# [English](https://github.com/Peter1303/SharedPreferencesHelper/blob/master/README_EN.md)
# 为什么选择 SharedPreferencesHelper ？
<ul>
 	<li>小巧玲珑</li>
 	<li>功能比较俱全</li>
 	<li>稳定快速</li>
 	<li>简洁不再繁杂</li>
</ul>

### Gradle
```groovy
compile 'com.peter1303.SharedPreferencesHelper'
```
支持的函数：

|  数据类型  |                 方法                 |
| --------- |:------------------------------------:|
| String    | save(String tag, String str);        |
| int       | save(String tag, int value);         |
| float     | save(String tag, float value);       |
| boolean   | save(String tag, boolean value);     |
| long      | save(String tag, long value);        |
| StringSet | save(String tag, Set<String> value); |

# 方法：
## 1.初始化 SharedPreferencesHelper
```java
private SharedPreferencesHelper sharedPreferencesHelper = null;
```
### 默认初始化（直接使用应用的包名）
```java
sharedPreferencesHelper = new SharedPreferencesHelper(Context context);
```
### 初始化（自定义名字）
```java
sharedPreferencesHelper = new SharedPreferencesHelper(Context context, String name);
```
### 初始化（自定义名字和存储模式）
```java
sharedPreferencesHelper = new SharedPreferencesHelper(Context context, int mode, String name);
```
## 2.方法
### 非常的简洁！
```java
sharedPreferencesHelper.save();
```
## 3.数据
### 删除一个数据
```java
sharedPreferencesHelper.delete(String tag);
```
### 清空所有的数据
```java
sharedPreferencesHelper.clear();
```
## 4.其他
### 这个库支持布尔值反转存储
```java
sharedPreferencesHelper.saveReverseBoolean(String tag, boolean defultValue);
```
### 如果您的应用需要存储应用的启动次数（调用一次记录一次）
```java
sharedPreferencesHelper.recordLaunchTimes();
```
### 得到应用的启动次数
```java
sharedPreferencesHelper.getLaunchTimes();
```
# 如果使用了该库，请务必遵守条约
