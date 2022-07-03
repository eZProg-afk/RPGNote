package spiral.bit.dev.rpgnote.ui

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import spiral.bit.dev.rpgnote.di.databaseModule
import spiral.bit.dev.rpgnote.di.repositoryModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setUpKoin()
    }

    private fun setUpKoin() {
        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@App)
            modules(
                databaseModule(this@App),
                repositoryModule
            )
        }
    }
}