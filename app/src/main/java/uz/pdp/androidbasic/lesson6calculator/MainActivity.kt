package uz.pdp.androidbasic.lesson6calculator

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import uz.pdp.androidbasic.lesson6calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding

    var first = false
    var second = false
    var equal = false
    var lastClicked = ""

    var number1 = ""
    var number2 = ""
    var operator = ""
    var dotClick = false
    var result: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numberClicks()
        operatorClick()
    }

    override fun onClick(v: View?) {
        val id = v?.id

        if (binding.number1.text.toString() == "0") {
            number1 = ""
        }

        when (id) {
            R.id.equal -> {
                if (number1.isNotEmpty() && operator.isNotEmpty() && number2.isNotEmpty()) {

                    when (operator) {
                        "+" -> result = number2.toDouble() + number1.toDouble()
                        "-" -> result = number2.toDouble() - number1.toDouble()
                        "*" -> result = number2.toDouble() * number1.toDouble()
                        "/" -> result = number2.toDouble() / number1.toDouble()
                    }
                    number2 = removeNol(result.toString())
                    number1 = ""
                    operator = ""
                    binding.number1.setText("")
                    binding.number2.text = number2
                    binding.operator.text = ""
                    equal = true
                    lastClicked = "equal"
                    dotClick = false
                }
            }
            R.id.plus -> {
                if (!(number1.isEmpty() && number2.isEmpty())) {
                    if (operator.isEmpty()) {
                        if (!equal) {
                            number2 = number1
                        }
                        binding.number2.text = number2
                        binding.number1.setText("0")
                        number1 = ""

                        when (operator) {
                            "+" -> binding.operator.text = "+"
                            "-" -> binding.operator.text = "+"
                            "*" -> binding.operator.text = "+"
                            "/" -> binding.operator.text = "+"
                            "" -> binding.operator.text = "+"
                        }
                        operator = "+"
                        lastClicked = "operator"
                        dotClick = false

                    } else if (number1.isNotEmpty() && number2.isNotEmpty()) {
                        when (operator) {
                            "+" -> result = number2.toDouble() + number1.toDouble()
                            "-" -> result = number2.toDouble() - number1.toDouble()
                            "*" -> result = number2.toDouble() * number1.toDouble()
                            "/" -> result = number2.toDouble() / number1.toDouble()
                        }
                        number2 = removeNol(result.toString())
                        number1 = ""
                        binding.number1.setText("0")
                        binding.number2.text = number2

                        when (operator) {
                            "+" -> binding.operator.text = "+"
                            "-" -> binding.operator.text = "+"
                            "*" -> binding.operator.text = "+"
                            "/" -> binding.operator.text = "+"
                            "" -> binding.operator.text = "+"
                        }
                        operator = "+"
                        lastClicked = "operator"
                        dotClick = false
                    }

                }
            }
            R.id.minus -> {
                if (!(number1.isEmpty() && number2.isEmpty())) {
                    if (operator.isEmpty()) {
                        if (!equal) {
                            number2 = number1
                        }
                        binding.number2.text = number2
                        binding.number1.setText("0")
                        number1 = ""

                        when (operator) {
                            "+" -> binding.operator.text = "-"
                            "-" -> binding.operator.text = "-"
                            "*" -> binding.operator.text = "-"
                            "/" -> binding.operator.text = "-"
                            "" -> binding.operator.text = "-"
                        }
                        operator = "-"
                        lastClicked = "operator"
                        dotClick = false

                    } else if (number1.isNotEmpty() && number2.isNotEmpty()) {
                        when (operator) {
                            "+" -> result = number2.toDouble() + number1.toDouble()
                            "-" -> result = number2.toDouble() - number1.toDouble()
                            "*" -> result = number2.toDouble() * number1.toDouble()
                            "/" -> result = number2.toDouble() / number1.toDouble()
                        }
                        number2 = removeNol(result.toString())
                        number1 = ""
                        binding.number1.setText("0")
                        binding.number2.text = number2

                        when (operator) {
                            "+" -> binding.operator.text = "-"
                            "-" -> binding.operator.text = "-"
                            "*" -> binding.operator.text = "-"
                            "/" -> binding.operator.text = "-"
                            "" -> binding.operator.text = "-"
                        }
                        operator = "-"
                        lastClicked = "operator"
                        dotClick = false
                    }

                }
            }
            R.id.multiplication -> {
                if (!(number1.isEmpty() && number2.isEmpty())) {
                    if (operator.isEmpty()) {
                        if (!equal) {
                            number2 = number1
                        }
                        binding.number2.text = number2
                        binding.number1.setText("0")
                        number1 = ""

                        when (operator) {
                            "+" -> binding.operator.text = "*"
                            "-" -> binding.operator.text = "*"
                            "*" -> binding.operator.text = "*"
                            "/" -> binding.operator.text = "*"
                            "" -> binding.operator.text = "*"
                        }
                        operator = "*"
                        lastClicked = "operator"
                        dotClick = false

                    } else if (number1.isNotEmpty() && number2.isNotEmpty()) {
                        when (operator) {
                            "+" -> result = number2.toDouble() + number1.toDouble()
                            "-" -> result = number2.toDouble() - number1.toDouble()
                            "*" -> result = number2.toDouble() * number1.toDouble()
                            "/" -> result = number2.toDouble() / number1.toDouble()
                        }
                        number2 = removeNol(result.toString())
                        number1 = ""
                        binding.number1.setText("0")
                        binding.number2.text = number2

                        when (operator) {
                            "+" -> binding.operator.text = "*"
                            "-" -> binding.operator.text = "*"
                            "*" -> binding.operator.text = "*"
                            "/" -> binding.operator.text = "*"
                            "" -> binding.operator.text = "*"
                        }
                        operator = "*"
                        lastClicked = "operator"
                        dotClick = false
                    }

                }
            }
            R.id.division -> {
                if (!(number1.isEmpty() && number2.isEmpty())) {
                    if (operator.isEmpty()) {
                        if (!equal) {
                            number2 = number1
                        }
                        binding.number2.text = number2
                        binding.number1.setText("0")
                        number1 = ""

                        when (operator) {
                            "+" -> binding.operator.text = "/"
                            "-" -> binding.operator.text = "/"
                            "*" -> binding.operator.text = "/"
                            "/" -> binding.operator.text = "/"
                            "" -> binding.operator.text = "/"
                        }
                        operator = "/"
                        lastClicked = "operator"
                        dotClick = false

                    } else if (number1.isNotEmpty() && number2.isNotEmpty()) {
                        when (operator) {
                            "+" -> result = number2.toDouble() + number1.toDouble()
                            "-" -> result = number2.toDouble() - number1.toDouble()
                            "*" -> result = number2.toDouble() * number1.toDouble()
                            "/" -> result = number2.toDouble() / number1.toDouble()
                        }
                        number2 = removeNol(result.toString())
                        number1 = ""
                        binding.number1.setText("0")
                        binding.number2.text = number2

                        when (operator) {
                            "+" -> binding.operator.text = "/"
                            "-" -> binding.operator.text = "/"
                            "*" -> binding.operator.text = "/"
                            "/" -> binding.operator.text = "/"
                            "" -> binding.operator.text = "/"
                        }
                        operator = "/"
                        lastClicked = "operator"
                        dotClick = false
                    }

                }
            }

            R.id.clear_all -> {

                first = false
                second = false
                equal = false
                lastClicked = ""
                result = 0.0
                number1 = ""
                number2 = ""
                operator = ""
                binding.number1.setText("0")
                binding.number2.text = ""
                binding.operator.text = ""
                dotClick = false
            }
            R.id.dot -> {
                if (!dotClick) {
                    if (lastClicked == "equal") {
                        lastClicked = "number"
                        binding.number2.text = ""
                        equal = false
                        number1 = ""
                        number2 = ""
                        operator = ""
                    }
                    if (number1.isEmpty()) {
                        number1 += "0."
                    } else {
                        number1 += "."
                    }
                    binding.number1.setText(number1)
                    dotClick = true
                }
            }
            R.id.nol -> {
                if (lastClicked == "equal") {
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                if (number1 != "0") {
                    number1 += "0"
                    binding.number1.setText(number1)
                }
                Log.d("AAAA", "onClick: 0")
            }

            R.id.one -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "1"
                binding.number1.setText(number1)
            }
            R.id.two -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "2"
                binding.number1.setText(number1)
            }
            R.id.three -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "3"
                binding.number1.setText(number1)
            }
            R.id.four -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "4"
                binding.number1.setText(number1)
            }
            R.id.five -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "5"
                binding.number1.setText(number1)
            }
            R.id.six -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "6"
                binding.number1.setText(number1)
            }
            R.id.seven -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "7"
                binding.number1.setText(number1)
            }
            R.id.eight -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "8"
                binding.number1.setText(number1)
            }
            R.id.nine -> {
                if (lastClicked == "equal") {
                    lastClicked = "number"
                    binding.number2.text = ""
                    equal = false
                    number1 = ""
                    number2 = ""
                    operator = ""
                }
                number1 += "9"
                binding.number1.setText(number1)
            }

            R.id.plus_minus -> {
                if (number1.isNotEmpty()) {
                    if (number1.first() != '-') {
                        number1 = "-$number1"
                    } else {
                        number1 = number1.substring(1)
                    }
                    binding.number1.setText(number1)
                }
            }

            R.id.percent -> {
                if (number2.isEmpty() && operator.isEmpty() && number1.isNotEmpty()) {
                    number1 = (number1.toDouble() / 100.0).toString()
                    binding.number1.setText(number1)
                } else if (number1.isNotEmpty() && operator.isNotEmpty() && number2.isNotEmpty()) {
                    when (operator) {
                        "+" -> {
                            number1 = ((number2.toDouble() * number1.toDouble()) / 100.0).toString()
                            binding.number1.setText(number1)
                        }
                        "-" -> {
                            number1 = ((number2.toDouble() * number1.toDouble()) / 100.0).toString()
                            binding.number1.setText(number1)
                        }
                        "*" -> {
                            number1 = (number1.toDouble() / 100.0).toString()
                            binding.number1.setText(number1)
                        }
                        "/" -> {
                            number1 = (number1.toDouble() / 100.0).toString()
                            binding.number1.setText(number1)
                        }
                    }
                }
            }
        }
    }

    private fun operatorClick() {
        binding.plusMinus.setOnClickListener(this)
        binding.percent.setOnClickListener(this)
        binding.division.setOnClickListener(this)
        binding.multiplication.setOnClickListener(this)
        binding.minus.setOnClickListener(this)
        binding.plus.setOnClickListener(this)
        binding.equal.setOnClickListener(this)
        binding.clearAll.setOnClickListener(this)
    }

    private fun numberClicks() {
        binding.dot.setOnClickListener(this)
        binding.nol.setOnClickListener(this)
        binding.one.setOnClickListener(this)
        binding.two.setOnClickListener(this)
        binding.three.setOnClickListener(this)
        binding.four.setOnClickListener(this)
        binding.five.setOnClickListener(this)
        binding.six.setOnClickListener(this)
        binding.seven.setOnClickListener(this)
        binding.eight.setOnClickListener(this)
        binding.nine.setOnClickListener(this)
    }

    private fun removeNol(result: String): String {
        if (result.substring(result.length - 2) == ".0") {
            return result.substring(0, result.length - 2)
        } else return result
    }

}