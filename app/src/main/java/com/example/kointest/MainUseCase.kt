package com.example.kointest

class MainUseCase(private val mainRepository: MainRepository) {
    fun execute(param: String): String {
        return mainRepository.auth(param)
    }
}