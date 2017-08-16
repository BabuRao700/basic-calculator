using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class BasicCalculator 
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter any basic operators + - * %:");
            string op = Console.ReadLine();
            Console.WriteLine("Enter the operands:");
            int operand1 = Convert.ToInt32(Console.ReadLine());
            int operand2 = Convert.ToInt32(Console.ReadLine());
            int result=0;
            switch (op)
            {
                case "+": result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "%":
                    result = operand1 % operand2;
                    break;
                default:
                        Console.WriteLine("Enter basic operations only");
                        break; 

            }
           Console.WriteLine("{0} {1} {2} = {3}", operand1,op,operand2,result);
            Console.Read();

        }
    }
}
