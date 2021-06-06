package br.com.suellencolangelo.todolist.domain

import br.com.suellencolangelo.todolist.domain.factory.ItemDomainFactory.makeItem
import br.com.suellencolangelo.todolist.domain.factory.ItemDomainFactory.makeSubItem
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


class ItemModelTest {
    @Test
    fun isAllSubItemsCompleted_allItemsCompleted_returnTrue() {
        val item = makeItem(
            subItems = listOf(makeSubItem(isCompleted = true), makeSubItem(isCompleted = true))
        )

        val actual = item.isAllSubItemsCompleted

        assertTrue(actual)
    }

    @Test
    fun isAllSubItemsCompleted_notAllItemsCompleted_returnFalse() {
        val item = makeItem(
            subItems = listOf(makeSubItem(isCompleted = true), makeSubItem(isCompleted = false))
        )

        val actual = item.isAllSubItemsCompleted

        assertFalse(actual)
    }
}
