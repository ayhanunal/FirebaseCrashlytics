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

```kotlin
val myDialog: Dialog by lifecycleAware { getDarkThemeDialog(baseContext) }
    .onCreate { this.show() } // show the dialog when the lifecycle's state is onCreate.
    .onDestroy { this.dismiss() } // dismiss the dialog when the lifecycle's state is onDestroy.
    .lazy() // initlize the dialog lazily.
```