package app.isfaaghyth.doaharian.data.repository

import app.isfaaghyth.doaharian.data.entity.DuaResult

interface DuaRepository {
    suspend fun get(): DuaResult
}