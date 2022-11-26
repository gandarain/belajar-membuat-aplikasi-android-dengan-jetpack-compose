package com.dicoding.jetcoffee.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.dicoding.jetcoffee.model.Category
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.jetcoffee.R
import com.dicoding.jetcoffee.ui.theme.JetCoffeeTheme

@Composable
fun CategoryItem(
    category: Category,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(category.imageCategory),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(category.textCategory),
            fontSize = 10.sp,
            modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 8.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CategoryItemPreview() {
    JetCoffeeTheme {
        CategoryItem(
            category = Category(
                R.drawable.icon_category_cappuccino,
                R.string.category_cappuccino,
            ),
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}