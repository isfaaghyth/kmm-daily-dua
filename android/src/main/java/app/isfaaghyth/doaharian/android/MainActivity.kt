package app.isfaaghyth.doaharian.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import app.isfaaghyth.doaharian.data.repository.DuaRepository
import app.isfaaghyth.doaharian.data.repository.DuaRepositoryImpl
import app.isfaaghyth.doaharian.di.DuaModule
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = SupervisorJob() + Dispatchers.IO

    private val getDua = DuaModule.getUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)

        launch {
            val result = getDua.execute()

            withContext(Dispatchers.Main) {
                var name = ""
                result.forEach {
                    name += it.name + "\n"
                }

                tv.text = name
            }
        }
    }
}
