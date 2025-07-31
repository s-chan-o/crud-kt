package practice.crudkt.domain.board.repository

import org.springframework.data.jpa.repository.JpaRepository
import practice.crudkt.domain.board.entity.Board

interface BoardRepository: JpaRepository<Board, Long> {
}