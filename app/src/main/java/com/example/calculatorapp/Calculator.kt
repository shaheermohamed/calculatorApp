package com.example.calculatorapp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.CalculatorButton
import com.example.calculatorapp.CalculatorState
import com.example.calculatorapp.ui.theme.LightGray
import com.example.calculatorapp.ui.theme.Orange

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Calculator(
    state:CalculatorState,
    buttonSpacing:Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
){
    Scaffold(
        modifier = modifier
            .systemBarsPadding()
            .imePadding().padding(bottom = 5.dp),
        content = {
            Box(modifier = modifier){
                Column(
                    modifier = Modifier
                        .fillMaxWidth().align(Alignment.BottomStart),
                    verticalArrangement = Arrangement.spacedBy(buttonSpacing)

                ) {
                    Text(
                        text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                        textAlign = TextAlign.End,
                        modifier= Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        fontWeight = FontWeight.Light,
                        color = Color.White,
                        maxLines = 2,
                        fontSize = 40.sp
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        CalculatorButton(
                            symbol = "AC",
                            modifier = Modifier
                                .background(LightGray)
                                .aspectRatio(2f)
                                .weight(2f),
                            onClick = {
                                onAction(CalculatorAction.Clear)
                            }
                        )
                        CalculatorButton(
                            symbol = "Del",
                            modifier = Modifier
                                .background(LightGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Delete)
                            }
                        )
                        CalculatorButton(
                            symbol = "/",
                            modifier = Modifier
                                .background(Orange)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculateOperation.Divide))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        CalculatorButton(
                            symbol = "7",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(7))
                            }
                        )
                        CalculatorButton(
                            symbol = "8",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(8))
                            }
                        )
                        CalculatorButton(
                            symbol = "9",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(9))
                            }
                        )
                        CalculatorButton(
                            symbol = "*",
                            modifier = Modifier
                                .background(Orange)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculateOperation.Multiply))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        CalculatorButton(
                            symbol = "4",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(4))
                            }
                        )
                        CalculatorButton(
                            symbol = "5",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(5))
                            }
                        )
                        CalculatorButton(
                            symbol = "6",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(6))
                            }
                        )
                        CalculatorButton(
                            symbol = "-",
                            modifier = Modifier
                                .background(Orange)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculateOperation.Subtract))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        CalculatorButton(
                            symbol = "1",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(1))
                            }
                        )
                        CalculatorButton(
                            symbol = "2",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(2))
                            }
                        )
                        CalculatorButton(
                            symbol = "3",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(3))
                            }
                        )
                        CalculatorButton(
                            symbol = "+",
                            modifier = Modifier
                                .background(Orange)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculateOperation.Add))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        CalculatorButton(
                            symbol = "0",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(2f)
                                .weight(2f),
                            onClick = {
                                onAction(CalculatorAction.Number(0))
                            }
                        )
                        CalculatorButton(
                            symbol = ".",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Decimal)
                            }
                        )
                        CalculatorButton(
                            symbol = "=",
                            modifier = Modifier
                                .background(Orange)
                                .aspectRatio(1f)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Calculate)
                            }
                        )
                    }

                }
            } }
    )

}