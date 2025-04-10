plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.filipe1309.abasteceai.ui.comparator"

    @Suppress("UnstableApiUsage")
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // Local Libs
    implementation(project(LocalLibs.domain_comparator))
    implementation(project(LocalLibs.domain_fuels))
    implementation(project(LocalLibs.domain_histories))
    implementation(project(LocalLibs.libraries_ui_components))
    implementation(project(LocalLibs.libraries_actions))

    // Koin
    implementation(Deps.koin_core)
    implementation(Deps.koin_android)

    implementation(Deps.androidx_core)
    implementation(Deps.androidx_support_lib)
    implementation(Deps.android_material_design)
    implementation(Deps.androidx_constraint_layout)

    // Play Services
    implementation(Deps.play_services_location)

    // ViewModel
    implementation(Deps.androidx_viewmodel)

    // Coroutines
    implementation(Deps.kotlinx_coroutines_core)
    implementation(Deps.kotlinx_coroutines_android)

    // Navigation
    implementation(Deps.androidx_nav_fragment)
    implementation(Deps.androidx_nav_ui)

    // Tests
    testImplementation(Deps.test_junit)
    androidTestImplementation(Deps.test_androidx_test_ext_junit)
    androidTestImplementation(Deps.test_androidx_espresso_core)
}
