package br.com.suellencolangelo.todolist.view.composeutils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RoundedCornerBoxWithBorder(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {
    val shape = RoundedCornerShape(10.dp)
    Box(
        modifier = modifier
            .border(border = BorderStroke(1.dp, Color.LightGray), shape = shape)
            .clip(shape)
            .background(Color.DarkGray),
    ) {
        content()
    }

}

@Preview
@Composable
fun Preview() {
    RoundedCornerBoxWithBorder()
}