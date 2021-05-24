# Firebasee Crashlytics


<p align="center">
😴 Firebase Crashlytics is a lightweight, realtime crash reporter that helps you track, prioritize, and fix stability issues that erode your app quality. Crashlytics saves you troubleshooting time by intelligently grouping crashes and highlighting the circumstances that lead up to them.
</p>


## Including in your project
If you haven't already, [add Firebase](https://firebase.google.com/docs/android/setup) to your Android project. 


### Gradle 
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
dependencies {
	classpath 'com.google.gms:google-services:4.3.5'
	classpath 'com.google.firebase:firebase-crashlytics-gradle:2.6.0'
    }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
plugins {
    id 'com.google.gms.google-services'
    id 'com.google.firebase.crashlytics'
}

dependencies {
    implementation 'com.google.firebase:firebase-crashlytics-ktx:17.4.0'
    implementation 'com.google.firebase:firebase-analytics-ktx:18.0.2'

    implementation platform('com.google.firebase:firebase-bom:27.1.0')
    implementation 'com.google.firebase:firebase-crashlytics-ktx'
    implementation 'com.google.firebase:firebase-analytics-ktx'
}
```
## Usage
### create crash
To finish setting up Crashlytics and see initial data in the Crashlytics dashboard of the Firebase console, you need to force a test crash.

![main_ss](https://github.com/ayhanunal/FirebaseCrashlytics/blob/main/ss/main_ss.png)
![click_ss](https://github.com/ayhanunal/FirebaseCrashlytics/blob/main/ss/click_ss.png)

1 -) Click on the 'create error' button and create a crash (1)

```kotlin
create_button.setOnClickListener {
	throw RuntimeException("Crash") // Force a crash
	}
```

2 -) Click the 'division by zero' button and create a division by zero crash (2)

```kotlin
division_zero_error.setOnClickListener {
            var result = 1/0
        }
```

3 -) Go to the Firebase Crashlytics console and check for crashes

![crashlytics_err](https://github.com/ayhanunal/FirebaseCrashlytics/blob/main/ss/crashlytics_err.png)

4 -) For crash details, choose one of the crashes

![crashlytics_err](https://github.com/ayhanunal/FirebaseCrashlytics/blob/main/ss/crash_detail.png)
