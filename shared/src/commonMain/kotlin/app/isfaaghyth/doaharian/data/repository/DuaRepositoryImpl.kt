package app.isfaaghyth.doaharian.data.repository

import app.isfaaghyth.doaharian.data.entity.DuaResult
import app.isfaaghyth.doaharian.network.HttpClientFactory
import io.ktor.client.call.*
import io.ktor.client.request.*

class DuaRepositoryImpl : DuaRepository {

    override suspend fun get(): DuaResult {
        return HttpClientFactory
            .create
            .get(URL)
            .body()
    }

    companion object {
        private const val URL = "https://isfa.dev/dua.json"
    }

}