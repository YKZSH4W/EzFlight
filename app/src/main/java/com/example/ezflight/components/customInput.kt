package com.example.ezflight.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomField(hint: String, onValueChange: (String) -> Unit) {
    var text by remember { mutableStateOf(hint) }
    var hasFocus by remember { mutableStateOf(false) }

    BasicTextField(
        value = text,
        onValueChange = {
            text = it
            onValueChange(it)
        },
        textStyle = TextStyle(
            color = if (!hasFocus && text == hint) Color.Gray else Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        ),
        singleLine = true,
        maxLines = 1,
        modifier = Modifier
            .background(Color(0xFFF4F4F4), RoundedCornerShape(8.dp))
            .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
            .padding(18.dp, 12.dp)
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                if (focusState.isFocused) {
                    if (text == hint) text = ""
                    hasFocus = true
                } else {
                    if (text.isEmpty()) text = hint
                    hasFocus = false
                }
            }
    )
}

@Preview
@Composable
fun showInput() {
    CustomField("Ingresa el correo electrónico", onValueChange = {})
}
