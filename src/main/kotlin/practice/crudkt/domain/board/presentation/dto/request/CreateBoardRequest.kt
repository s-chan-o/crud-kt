package practice.crudkt.domain.board.presentation.dto.request

import jakarta.validation.constraints.NotBlank

data class CreateBoardRequest(
    @field:NotBlank
    val title: String,
    @field:NotBlank
    val content: String
)