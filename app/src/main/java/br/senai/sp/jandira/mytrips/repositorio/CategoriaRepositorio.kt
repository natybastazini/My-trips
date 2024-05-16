package br.senai.sp.jandira.mytrips.repositorio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Mosque
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Categoria

class CategoriaRepositorio {
    @Composable
    fun listarTodasAsCategorias(): List<Categoria> {
        val montain = Categoria(
            id = 1,
            nome = stringResource(id = R.string.montain),
            icone = Icons.Default.Landscape
        )
        val snow = Categoria(
            id = 2,
            nome = stringResource(id = R.string.snow),
            icone = Icons.Default.Snowboarding
        )
        val beach = Categoria(
            id = 3,
            nome = stringResource(id = R.string.beach),
            icone = Icons.Default.BeachAccess
        )

        return listOf(montain,snow, beach)
    }
}
