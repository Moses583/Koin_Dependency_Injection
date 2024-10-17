package com.ravemaster.koindependencyinjection.di

import com.ravemaster.koindependencyinjection.dependencies.DbClient
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}