using System;

namespace dotnet
{
    internal class Calculator
    {
        internal int plus(int leftOperand, int rightOperand)
        {
            return leftOperand + rightOperand;
        }

        internal int minus(int leftOperand, int rightOperand)
        {
            return leftOperand - rightOperand;
        }

        internal int multiply(int leftOperand, int rightOperand)
        {
            return leftOperand * rightOperand;
        }

        internal int divide(int leftOperand, int rightOperand)
        {
            return leftOperand / rightOperand;
        }
    }
}