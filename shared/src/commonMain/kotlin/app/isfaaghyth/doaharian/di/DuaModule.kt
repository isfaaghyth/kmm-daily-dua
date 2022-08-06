package app.isfaaghyth.doaharian.di

import app.isfaaghyth.doaharian.data.repository.DuaRepository
import app.isfaaghyth.doaharian.data.repository.DuaRepositoryImpl
import app.isfaaghyth.doaharian.domain.GetDuaUseCase

object DuaModule {

    private fun provideRepository(): DuaRepository {
        return DuaRepositoryImpl()
    }

    private fun provideUseCase(): GetDuaUseCase {
        return GetDuaUseCase(
            provideRepository()
        )
    }

    fun getUseCase() = provideUseCase()

}