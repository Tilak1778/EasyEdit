plugins {
    id("com.android.application")
}

android {
    namespace = "com.richmama.easyedit"
    compileSdk = 33
    buildToolsVersion = "29.0.2"

    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.richmama.easyedit"
        minSdk = 27
        targetSdk = 33
        versionCode = 3
        versionName = "1.3"

        renderscriptTargetApi = 29
        renderscriptSupportModeEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))

    implementation("io.reactivex.rxjava2:rxjava:2.1.0")
    implementation("io.reactivex.rxjava2:rxandroid:2.0.1")
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("com.google.android.gms:play-services-ads:22.4.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.11.0")









}