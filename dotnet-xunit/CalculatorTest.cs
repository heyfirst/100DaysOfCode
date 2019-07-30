using System;
using Xunit;

namespace dotnet
{
    public class CalculatorTest
    {
        [Fact]
        public void AlwaysTrue()
        {
            Assert.True(true);
        }

        [Fact]
        public void ShouldReturn2WhenPlus1With1()
        {
            Calculator calculator = new Calculator();
            Int32 actual = calculator.plus(1, 1);
            Int32 expected = 2;
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void ShouldReturn2WhenMinus5With3()
        {
            Calculator calculator = new Calculator();
            Int32 actual = calculator.minus(5, 3);
            Int32 expected = 2;
            Assert.Equal(expected, actual);
        }


        [Fact]
        public void ShouldReturn15WhenMultiply5With3()
        {
            Calculator calculator = new Calculator();
            Int32 actual = calculator.multiply(5, 3);
            Int32 expected = 15;
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void ShouldReturn2WhenDivide6With3()
        {
            Calculator calculator = new Calculator();
            Int32 actual = calculator.divide(6, 3);
            Int32 expected = 2;
            Assert.Equal(expected, actual);
        }
    }
}
