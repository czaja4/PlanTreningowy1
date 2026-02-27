plugins {

    alias(libs.plugins.android.application)

}

android {

    namespace = "com.example.plantreningowy"

    compileSdk = 34

    defaultConfig {

        applicationId = "com.example.plantreningowy"

        minSdk = 24

        targetSdk = 34

        versionCode = 1

        versionName = "1.0"

    }

}

dependencies {

    implementation(libs.appcompat)

    implementation(libs.material)

}
