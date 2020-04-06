package br.com.eric.pokedex.view.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.eric.pokedex.api.PokemonRepository
import br.com.eric.pokedex.model.Pokemon

class DetailViewModel(
    val pokemonRepository: PokemonRepository
) : ViewModel() {
    val isLoading = MutableLiveData<Boolean>()
    val messageError = MutableLiveData<String>().apply { postValue("initial value")}
    val pokemon = MutableLiveData<Pokemon>()
//    fun getPokemon(number: String) {
//        isLoading.value = true
//        pokemonRepository.getPokemon(
//            number,
//            onComplete = {
//                isLoading.value = false
//                pokemon.value = it
//            },
//            onError = {
//                isLoading.value = false
//            }
//        )
//    }
}