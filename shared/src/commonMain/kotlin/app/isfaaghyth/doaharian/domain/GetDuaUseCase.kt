package app.isfaaghyth.doaharian.domain

import app.isfaaghyth.doaharian.data.entity.Dua
import app.isfaaghyth.doaharian.data.repository.DuaRepository

class GetDuaUseCase constructor(
    private val repository: DuaRepository
) {

    suspend fun execute(): List<Dua> {
        return repository.get().data
    }

}