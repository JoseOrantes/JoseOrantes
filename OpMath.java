import java.util.Scanner;

public class OpMath
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int op = 0;
		double num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		double num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0;
		double ans = 0, ans1 = 0;
		boolean user = true;
		do // Menu Principal
		{
			System.out.println("");
			System.out.println("******************************************");
			System.out.println("**                                      **");
			System.out.println("**        Operaciones Matematicas       **");
			System.out.println("**                                      **");
			System.out.println("**  Presione 1 para iniciar el sistema  **");
			System.out.println("**                                      **");
			System.out.println("**  Presione 2 para salir del programa  **");
			System.out.println("**                                      **");
			System.out.println("**                                      **");
			System.out.println("**                         Version 1.0  **");
			System.out.println("**                                      **");
			System.out.println("******************************************");
			System.out.println("");
			op = in.nextInt();
			if(op == 1) // Menu de Operaciones
			{
				do
				{
					System.out.println("");
					System.out.println("******************************************");
					System.out.println("**                                      **");
					System.out.println("**        Listado de Operaciones        **");
					System.out.println("**                                      **");
					System.out.println("**    1) Operaciones Aritmeticas        **");
					System.out.println("**                                      **");
					System.out.println("**    2) Operaciones Geometricas        **");
					System.out.println("**                                      **");
					System.out.println("**    3) Operaciones de Estadistica     **");
					System.out.println("**                                      **");
					System.out.println("**    4) Matrices por Gauss Jordan      **");
					System.out.println("**                                      **");
					System.out.println("**    5) Operaciones Avanzadas          **");
					System.out.println("**                                      **");
					System.out.println("**    6) Regresar al menu principal     **");
					System.out.println("**                                      **");
					System.out.println("******************************************");
					System.out.println("");
					op = in.nextInt();
					if(op == 1) // Menu de Operaciones Aritmeticas
					{
						do
						{
								System.out.println("");
								System.out.println("******************************************");
								System.out.println("**                                      **");
								System.out.println("**       Operaciones Aritmeticas        **");
								System.out.println("**                                      **");
								System.out.println("**    1) Suma                           **");
								System.out.println("**                                      **");
								System.out.println("**    2) Resta                          **");
								System.out.println("**                                      **");
								System.out.println("**    3) Multiplicacion                 **");
								System.out.println("**                                      **");
								System.out.println("**    4) Division                       **");
								System.out.println("**                                      **");
								System.out.println("**    5) Regresar al menu anterior      **");
								System.out.println("**                                      **");
								System.out.println("******************************************");
								System.out.println("");
								op = in.nextInt();
								if(op == 1) // Suma
								{
									System.out.println("");
									System.out.println("******************************************");
									System.out.println("**                                      **");
									System.out.println("**                Suma                  **");
									System.out.println("**                                      **");
									System.out.println("******************************************");
									System.out.println("");
									System.out.println("Ingrese numero (1) a sumar:  ");
									System.out.println("");
									num1 = in.nextDouble();
									System.out.println("");
									System.out.println("Ingrese numero (2) a sumar:  ");
									num2 = in.nextDouble();
									System.out.println("");
									System.out.println("Desea sumar otro numero?  1) Si  2) No");
									System.out.println("");
									op = in.nextInt();
									System.out.println("");
									if(op == 1) //Tercer numero a operar
									{
										System.out.println("");
										System.out.println("Ingrese numero (3) a sumar:  ");
										System.out.println("");
										num3 = in.nextDouble();
										System.out.println("");
										System.out.println("Desea sumar otro numero:  1) Si  2) No");
										System.out.println("");
										op = in.nextInt();
										System.out.println("");
										if(op == 1) //Cuarto numero a operar
										{
											System.out.println("");
											System.out.println("Ingrese numero (4) a sumar:  ");
											System.out.println("");
											num4 = in.nextDouble();
											System.out.println("");
											System.out.println("Desea sumar otro numero:  1) Si  2) No");
											System.out.println("");
											op = in.nextInt();
											System.out.println("");
											if(op == 1) //Quinto numero a operar
											{
												System.out.println("");
												System.out.println("Ingrese numero (5) a sumar:  ");
												System.out.println("");
												num5 = in.nextDouble();
												System.out.println("");
												System.out.println("Desea sumar otro numero:  1) Si  2) No");
												System.out.println("");
												op = in.nextInt();
												System.out.println("");
												if(op == 1) //Sexto numero a operar
												{
													System.out.println("");
													System.out.println("Ingrese numero (6) a sumar:  ");
													System.out.println("");
													num6 = in.nextDouble();
													System.out.println("");
													System.out.println("Desea sumar otro numero:  1) Si  2) No");
													System.out.println("");
													op = in.nextInt();
													System.out.println("");
													if(op == 1) // Septimo numero a operar
													{
														System.out.println("");
														System.out.println("Ingrese numero (7) a sumar:  ");
														System.out.println("");
														num7 = in.nextDouble();
														System.out.println("");
														System.out.println("Desea sumar otro numero:  1) Si  2) No");
														System.out.println("");
														op = in.nextInt();
														System.out.println("");
														if(op == 1) //Octavo numero a operar
														{
																System.out.println("");
																System.out.println("Ingrese numero (8) a sumar:  ");
																System.out.println("");
																num8 = in.nextDouble();
																System.out.println("");
																System.out.println("Desea sumar otro numero:  1) Si  2) No");
																System.out.println("");
																op = in.nextInt();
																System.out.print("");
																if(op == 1) //Noveno numero a operar
																{
																	System.out.println("");
																	System.out.println("Ingrese numero (9) a sumar:  ");
																	System.out.println("");
																	num9 = in.nextDouble();
																	System.out.println("");
																	System.out.println("Desea sumar otro numero:  1) Si  2) No");
																	System.out.println("");
																	op = in.nextInt();
																	System.out.println("");
																	if(op == 1) //Decimo numero a operar
																	{
																	System.out.println("");
																	System.out.println("Ingrese numero (10) a sumar:  ");
																	System.out.println("");
																	num10 = in.nextDouble();
																	System.out.println("");
																	ans = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
																	System.out.println("");
																	System.out.println("El resultado de la suma es:  " + ans);
																	}
																	else if(op == 2)
																	{
																		System.out.println("");
																		ans = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
																		System.out.println("");
																		System.out.println("El resultado de la suma es:  " + ans);
																		System.out.println("");
																	}
																}
															else if(op == 2)
															{
																System.out.println("");
																ans = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
																System.out.println("");
																System.out.println("El resultado de la suma es:  " + ans);
																System.out.println("");
															}
														}
														else if(op == 2)
														{
															System.out.println("");
															ans = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
															System.out.println("");
															System.out.println("El resultado de la suma es:  " + ans);
															System.out.println("");
														}
													}
													else if(op == 2)
													{
														System.out.println("");
														ans = num1 + num2 + num3 + num4 + num5 + num6 + num7;
														System.out.println("");
														System.out.println("El resultado de la suma es:  " + ans);
														System.out.println("");
													}
												}
												else if(op ==2)
												{
												System.out.println("");
												ans = num1 + num2 + num3 + num4 + num5 + num6;
												System.out.println("");
												System.out.println("El resultado de la suma es:  " + ans);
												System.out.println("");
												}
											}
											else if(op == 2)
											{
												System.out.println("");
												ans = num1 + num2 + num3 + num4 + num5;
												System.out.println("");
												System.out.println("El resultado de la suma es:  " + ans);
												System.out.println("");
											}
										}
										else if(op == 2)
										{
											System.out.println("");
											ans = num1 + num2 + num3 + num4;
											System.out.println("");
											System.out.println("El resultado de la suma es:  " + ans);
											System.out.println("");
										}
									}
									else if(op == 2)
									{
										System.out.println("");
										ans = num1 + num2;
										System.out.println("");
										System.out.println("El resultado de la suma es:  " + ans);
										System.out.println("");
									}
								}
								else if(op == 2) // Resta
								{
									System.out.println("");
									System.out.println("******************************************");
									System.out.println("**                                      **");
									System.out.println("**                 Resta                **");
									System.out.println("**                                      **");
									System.out.println("******************************************");
									System.out.println("");
									System.out.println("Ingrese numero (1) a restar:  ");
									System.out.println("");
									num1 = in.nextDouble();
									System.out.println("");
									System.out.println("Ingrese numero (2) a restar:  ");
									num2 = in.nextDouble();
									System.out.println("");
									System.out.println("Desea restar otro numero?  1) Si  2) No");
									System.out.println("");
									op = in.nextInt();
									System.out.println("");
									if(op == 1) //Tercer numero a operar
									{
										System.out.println("");
										System.out.println("Ingrese numero (3) a restar:  ");
										System.out.println("");
										num3 = in.nextDouble();
										System.out.println("");
										System.out.println("Desea restar otro numero:  1) Si  2) No");
										System.out.println("");
										op = in.nextInt();
										System.out.println("");
										if(op == 1) //Cuarto numero a operar
										{
											System.out.println("");
											System.out.println("Ingrese numero (4) a restar:  ");
											System.out.println("");
											num4 = in.nextDouble();
											System.out.println("");
											System.out.println("Desea restar otro numero:  1) Si  2) No");
											System.out.println("");
											op = in.nextInt();
											System.out.println("");
											if(op == 1) //Quinto numero a operar
											{
												System.out.println("");
												System.out.println("Ingrese numero (5) a restar:  ");
												System.out.println("");
												num5 = in.nextDouble();
												System.out.println("");
												System.out.println("Desea restar otro numero:  1) Si  2) No");
												System.out.println("");
												op = in.nextInt();
												System.out.println("");
												if(op == 1) //Sexto numero a operar
												{
													System.out.println("");
													System.out.println("Ingrese numero (6) a restar:  ");
													System.out.println("");
													num6 = in.nextDouble();
													System.out.println("");
													System.out.println("Desea restar otro numero:  1) Si  2) No");
													System.out.println("");
													op = in.nextInt();
													System.out.println("");
													if(op == 1) // Septimo numero a operar
													{
														System.out.println("");
														System.out.println("Ingrese numero (7) a restar:  ");
														System.out.println("");
														num7 = in.nextDouble();
														System.out.println("");
														System.out.println("Desea restar otro numero:  1) Si  2) No");
														System.out.println("");
														op = in.nextInt();
														System.out.println("");
														if(op == 1) //Octavo numero a operar
														{
																System.out.println("");
																System.out.println("Ingrese numero (8) a restar:  ");
																System.out.println("");
																num8 = in.nextDouble();
																System.out.println("");
																System.out.println("Desea restar otro numero:  1) Si  2) No");
																System.out.println("");
																op = in.nextInt();
																System.out.print("");
																if(op == 1) //Noveno numero a operar
																{
																	System.out.println("");
																	System.out.println("Ingrese numero (9) a restar:  ");
																	System.out.println("");
																	num9 = in.nextDouble();
																	System.out.println("");
																	System.out.println("Desea restar otro numero:  1) Si  2) No");
																	System.out.println("");
																	op = in.nextInt();
																	System.out.println("");
																	if(op == 1) //Decimo numero a operar
																	{
																	System.out.println("");
																	System.out.println("Ingrese numero (10) a restar:  ");
																	System.out.println("");
																	num10 = in.nextDouble();
																	System.out.println("");
																	ans = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;
																	System.out.println("");
																	System.out.println("El resultado de la resta es:  " + ans);
																	}
																	else if(op == 2)
																	{
																		System.out.println("");
																		ans = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9;
																		System.out.println("");
																		System.out.println("El resultado de la resta es:  " + ans);
																		System.out.println("");
																	}
																}
															else if(op == 2)
															{
																System.out.println("");
																ans = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9;
																System.out.println("");
																System.out.println("El resultado de la resta es:  " + ans);
																System.out.println("");
															}
														}
														else if(op == 2)
														{
															System.out.println("");
															ans = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8;
															System.out.println("");
															System.out.println("El resultado de la resta es:  " + ans);
															System.out.println("");
														}
													}
													else if(op == 2)
													{
														System.out.println("");
														ans = num1 - num2 - num3 - num4 - num5 - num6 - num7;
														System.out.println("");
														System.out.println("El resultado de la resta es:  " + ans);
														System.out.println("");
													}
												}
												else if(op ==2)
												{
												System.out.println("");
												ans = num1 - num2 - num3 - num4 - num5 - num6;
												System.out.println("");
												System.out.println("El resultado de la resta es:  " + ans);
												System.out.println("");
												}
											}
											else if(op == 2)
											{
												System.out.println("");
												ans = num1 - num2 - num3 - num4 - num5;
												System.out.println("");
												System.out.println("El resultado de la resta es:  " + ans);
												System.out.println("");
											}
										}
										else if(op == 2)
										{
											System.out.println("");
											ans = num1 - num2 - num3 - num4;
											System.out.println("");
											System.out.println("El resultado de la resta es:  " + ans);
											System.out.println("");
										}
									}
									else if(op == 2)
									{
										System.out.println("");
										ans = num1 - num2;
										System.out.println("");
										System.out.println("El resultado de la resta es:  " + ans);
										System.out.println("");
									}
								}
								else if(op == 3) // Multiplicacion
								{
									System.out.println("");
									System.out.println("******************************************");
									System.out.println("**                                      **");
									System.out.println("**             Multiplicación           **");
									System.out.println("**                                      **");
									System.out.println("******************************************");
									System.out.println("");
									System.out.println("Ingrese numero (1) a multiplicar:  ");
									System.out.println("");
									num1 = in.nextDouble();
									System.out.println("");
									System.out.println("Ingrese numero (2) a multiplicar:  ");
									System.out.println("");
									num2 = in.nextDouble();
									System.out.println("");
									System.out.println("Desea multiplicar otro numero?  1) Si  2) No");
									System.out.println("");
									op = in.nextInt();
									System.out.println("");
									if(op == 1) //Tercer numero a operar
									{
										System.out.println("");
										System.out.println("Ingrese numero (3) a multiplicar:  ");
										System.out.println("");
										num3 = in.nextDouble();
										System.out.println("");
										System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
										System.out.println("");
										op = in.nextInt();
										System.out.println("");
										if(op == 1) //Cuarto numero a operar
										{
											System.out.println("");
											System.out.println("Ingrese numero (4) a multiplicar:  ");
											System.out.println("");
											num4 = in.nextDouble();
											System.out.println("");
											System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
											System.out.println("");
											op = in.nextInt();
											System.out.println("");
											if(op == 1) //Quinto numero a operar
											{
												System.out.println("");
												System.out.println("Ingrese numero (5) a multiplicar:  ");
												System.out.println("");
												num5 = in.nextDouble();
												System.out.println("");
												System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
												System.out.println("");
												op = in.nextInt();
												System.out.println("");
												if(op == 1) //Sexto numero a operar
												{
													System.out.println("");
													System.out.println("Ingrese numero (6) a multiplicar:  ");
													System.out.println("");
													num6 = in.nextDouble();
													System.out.println("");
													System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
													System.out.println("");
													op = in.nextInt();
													System.out.println("");
													if(op == 1) // Septimo numero a operar
													{
														System.out.println("");
														System.out.println("Ingrese numero (7) a multiplicar:  ");
														System.out.println("");
														num7 = in.nextDouble();
														System.out.println("");
														System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
														System.out.println("");
														op = in.nextInt();
														System.out.println("");
														if(op == 1) //Octavo numero a operar
														{
																System.out.println("");
																System.out.println("Ingrese numero (8) a multiplicar:  ");
																System.out.println("");
																num8 = in.nextDouble();
																System.out.println("");
																System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
																System.out.println("");
																op = in.nextInt();
																System.out.print("");
																if(op == 1) //Noveno numero a operar
																{
																	System.out.println("");
																	System.out.println("Ingrese numero (9) a multiplicar:  ");
																	System.out.println("");
																	num9 = in.nextDouble();
																	System.out.println("");
																	System.out.println("Desea multiplicar otro numero:  1) Si  2) No");
																	System.out.println("");
																	op = in.nextInt();
																	System.out.println("");
																	if(op == 1) //Decimo numero a operar
																	{
																	System.out.println("");
																	System.out.println("Ingrese numero (10) a multiplicar:  ");
																	System.out.println("");
																	num10 = in.nextDouble();
																	System.out.println("");
																	ans = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
																	System.out.println("");
																	System.out.println("El resultado de la mutiplicación es:  " + ans);
																	}
																	else if(op == 2)
																	{
																		System.out.println("");
																		ans = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9;
																		System.out.println("");
																		System.out.println("El resultado de la multiplicación es:  " + ans);
																		System.out.println("");
																	}
																}
															else if(op == 2)
															{
																System.out.println("");
																ans = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9;
																System.out.println("");
																System.out.println("El resultado de la multiplicación es:  " + ans);
																System.out.println("");
															}
														}
														else if(op == 2)
														{
															System.out.println("");
															ans = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8;
															System.out.println("");
															System.out.println("El resultado de la multiplicación es:  " + ans);
															System.out.println("");
														}
													}
													else if(op == 2)
													{
														System.out.println("");
														ans = num1 * num2 * num3 * num4 * num5 * num6 * num7;
														System.out.println("");
														System.out.println("El resultado de la multiplicación es:  " + ans);
														System.out.println("");
													}
												}
												else if(op ==2)
												{
												System.out.println("");
												ans = num1 * num2 * num3 * num4 * num5 * num6;
												System.out.println("");
												System.out.println("El resultado de la multiplicación es:  " + ans);
												System.out.println("");
												}
											}
											else if(op == 2)
											{
												System.out.println("");
												ans = num1 * num2 * num3 * num4 * num5;
												System.out.println("");
												System.out.println("El resultado de la multiplicación es:  " + ans);
												System.out.println("");
											}
										}
										else if(op == 2)
										{
											System.out.println("");
											ans = num1 * num2 * num3 * num4;
											System.out.println("");
											System.out.println("El resultado de la multiplicación es:  " + ans);
											System.out.println("");
										}
									}
									else if(op == 2)
									{
										System.out.println("");
										ans = num1 * num2;
										System.out.println("");
										System.out.println("El resultado de la multiplicación es:  " + ans);
										System.out.println("");
									}
								}
								else if(op == 4) // Division
								{
									System.out.println("");
									System.out.println("******************************************");
									System.out.println("**                                      **");
									System.out.println("**               División               **");
									System.out.println("**                                      **");
									System.out.println("******************************************");
									System.out.println("");
									System.out.println("Ingrese numero (1) a dividir:  ");
									System.out.println("");
									num1 = in.nextDouble();
									System.out.println("");
									System.out.println("Ingrese numero (2) a dividir:  ");
									System.out.println("");
									System.out.println("");
									num2 = in.nextDouble();
									System.out.println("");
									System.out.println("Desea dividir otro numero?  1) Si  2) No");
									System.out.println("");
									op = in.nextInt();
									System.out.println("");
									if(op == 1) //Tercer numero a operar
									{
										System.out.println("");
										System.out.println("Ingrese numero (3) a dividir:  ");
										System.out.println("");
										num3 = in.nextDouble();
										System.out.println("");
										System.out.println("Desea dividir otro numero:  1) Si  2) No");
										System.out.println("");
										op = in.nextInt();
										System.out.println("");
										if(op == 1) //Cuarto numero a operar
										{
											System.out.println("");
											System.out.println("Ingrese numero (4) a dividir:  ");
											System.out.println("");
											num4 = in.nextDouble();
											System.out.println("");
											System.out.println("Desea dividir otro numero:  1) Si  2) No");
											System.out.println("");
											op = in.nextInt();
											System.out.println("");
											if(op == 1) //Quinto numero a operar
											{
												System.out.println("");
												System.out.println("Ingrese numero (5) a dividir:  ");
												System.out.println("");
												num5 = in.nextDouble();
												System.out.println("");
												System.out.println("Desea dividir otro numero:  1) Si  2) No");
												System.out.println("");
												op = in.nextInt();
												System.out.println("");
												if(op == 1) //Sexto numero a operar
												{
													System.out.println("");
													System.out.println("Ingrese numero (6) a dividir:  ");
													System.out.println("");
													num6 = in.nextDouble();
													System.out.println("");
													System.out.println("Desea dividir otro numero:  1) Si  2) No");
													System.out.println("");
													op = in.nextInt();
													System.out.println("");
													if(op == 1) // Septimo numero a operar
													{
														System.out.println("");
														System.out.println("Ingrese numero (7) a dividir:  ");
														System.out.println("");
														num7 = in.nextDouble();
														System.out.println("");
														System.out.println("Desea dividir otro numero:  1) Si  2) No");
														System.out.println("");
														op = in.nextInt();
														System.out.println("");
														if(op == 1) //Octavo numero a operar
														{
																System.out.println("");
																System.out.println("Ingrese numero (8) a dividir:  ");
																System.out.println("");
																num8 = in.nextDouble();
																System.out.println("");
																System.out.println("Desea dividir otro numero:  1) Si  2) No");
																System.out.println("");
																op = in.nextInt();
																System.out.print("");
																if(op == 1) //Noveno numero a operar
																{
																	System.out.println("");
																	System.out.println("Ingrese numero (9) a dividir:  ");
																	System.out.println("");
																	num9 = in.nextDouble();
																	System.out.println("");
																	System.out.println("Desea dividir otro numero:  1) Si  2) No");
																	System.out.println("");
																	op = in.nextInt();
																	System.out.println("");
																	if(op == 1) //Decimo numero a operar
																	{
																	System.out.println("");
																	System.out.println("Ingrese numero (10) a dividir:  ");
																	System.out.println("");
																	num10 = in.nextDouble();
																	System.out.println("");
																	ans = num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8 / num9 / num10;
																	System.out.println("");
																	System.out.println("El resultado de la división es:  " + ans);
																	}
																	else if(op == 2)
																	{
																		System.out.println("");
																		ans = num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8 / num9;
																		System.out.println("");
																		System.out.println("El resultado de la división es:  " + ans);
																		System.out.println("");
																	}
																}
															else if(op == 2)
															{
																System.out.println("");
																ans = num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8 / num9;
																System.out.println("");
																System.out.println("El resultado de la división es:  " + ans);
																System.out.println("");
															}
														}
														else if(op == 2)
														{
															System.out.println("");
															ans = num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8;
															System.out.println("");
															System.out.println("El resultado de la división es:  " + ans);
															System.out.println("");
														}
													}
													else if(op == 2)
													{
														System.out.println("");
														ans = num1 / num2 / num3 / num4 / num5 / num6 / num7;
														System.out.println("");
														System.out.println("El resultado de la división es:  " + ans);
														System.out.println("");
													}
												}
												else if(op ==2)
												{
												System.out.println("");
												ans = num1 / num2 / num3 / num4 / num5 / num6;
												System.out.println("");
												System.out.println("El resultado de la división es:  " + ans);
												System.out.println("");
												}
											}
											else if(op == 2)
											{
												System.out.println("");
												ans = num1 / num2 / num3 / num4 / num5;
												System.out.println("");
												System.out.println("El resultado de la división es:  " + ans);
												System.out.println("");
											}
										}
										else if(op == 2)
										{
											System.out.println("");
											ans = num1 / num2 / num3 / num4;
											System.out.println("");
											System.out.println("El resultado de la división es:  " + ans);
											System.out.println("");
										}
									}
									else if(op == 2)
									{
										System.out.println("");
										ans = num1 / num2;
										System.out.println("");
										System.out.println("El resultado de la división es:  " + ans);
										System.out.println("");
									}
								}
								
							else if(op > 5)
							{
								System.out.println("");
								System.out.println("Error, Opcion no disponible...");
								System.out.println("");
							}
							else if(op == 5)
							{
								break;
							}
						}
						while(true);
					}
					else if(op == 2) // Menu Operaciones Geometricas
					{
						do
						{
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**          Areas y Perimetros          **");
							System.out.println("**                                      **");
							System.out.println("**         Figuras Geometricas          **");
							System.out.println("**                                      **");
							System.out.println("**      1) Triangulo                    **");
							System.out.println("**                                      **");
							System.out.println("**      2) Cuadrado                     **");
							System.out.println("**                                      **");
							System.out.println("**      3) Rectangulo                   **");   
							System.out.println("**                                      **");
							System.out.println("**      4) Circulo                      **");
							System.out.println("**                                      **");
							System.out.println("**      5) Regresar al menu anterior    **");
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							op = in.nextInt();
							if(op == 1)
							{
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**               Triangulo              **");
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							System.out.println("Ingrese la base:  ");
							System.out.println("");
							num1 = in.nextDouble();
							System.out.println("");
							System.out.println("Ingrese la altura:  ");
							System.out.println("");
							num2 = in.nextDouble();
							ans = (num1 * num2)*0.5;
							System.out.println("");
							System.out.println("Ingrese lado a:  ");
							System.out.println("");
							num3 = in.nextDouble();
							System.out.println("");
							System.out.println("Ingrese lado b:  ");
							System.out.println("");
							num4 = in.nextDouble();
							ans1 = num1 + num3 + num4;
							System.out.println("");
							System.out.println("El area del triangulo es:  " + ans);
							System.out.println("");
							System.out.println("El perimetro del triangulo es:  " + ans1);
							System.out.println("");
						}
							else if(op == 2)
							{
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**               Cuadrado               **"); 
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							System.out.println("Ingrese el lado:  ");
							System.out.println("");
							num1 = in.nextDouble();
							System.out.println("");
							ans = num1 * num1;
							ans1 = num1 + num1 + num1 + num1;
							System.out.println("");
							System.out.println("El area del Cuadrado es:  " + ans);
							System.out.println("");
							System.out.println("El perimetro del Cuadrado es:  " + ans1);
							System.out.println("");
						}
							else if(op == 3)
							{
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**              Rectangulo              **");
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							System.out.println("Ingrese la base:  ");
							System.out.println("");
							num1 = in.nextDouble();
							System.out.println("");
							System.out.println("Ingrese la altura:  ");
							System.out.println("");
							num2 = in.nextDouble();
							ans = num1 * num2;
							ans1 = (2*num1)+(2*num2);
							System.out.println("");
							System.out.println("El area del rectangulo es:  " + ans);
							System.out.println("");
							System.out.println("El perimetro del rectangulo es:  " + ans1);
							System.out.println("");
						}
							else if(op == 4)
							{
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**         Area de un Circulo           **");
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							System.out.println("Formula Area de un Circulo π(radio)²");
							System.out.println("");
							System.out.println("Ingrese el radio:  ");
							System.out.println("");
							num1 = in.nextDouble();
							System.out.println("");
							ans = (num1 * num1)*3.1416;
							ans1 = (2*(num1*num1))*3.1416;
							System.out.println("");
							System.out.println("El area del Circulo es:  " + ans);
							System.out.println("");
							System.out.println("El perimetro del Circulo es:  " + ans1);
							System.out.println("");
							}
							else if(op > 5)
							{
								System.out.println("");
								System.out.println("Error, La opcion no esta disponible");
								System.out.println("");
							}
							else if(op == 5)
							{
								break;
							}
						}						
						while(true);
					}
					else if(op == 3) // Menu Operaciones de Estadistica
					{
						System.out.println("");
						System.out.println("Work in progress...");
						System.out.println("");
					}
					else if(op == 4) // Menu Matrices por Gauss Jordan
					{
						do 
						{
							int  m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0;
							int valores [][] = new int [2][2];
							int valores1 [][] = new int [3][3];
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**                Matrices              **");
							System.out.println("**                                      **");
							System.out.println("**      Resolución por Gauss Jordan     **");
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							System.out.println(" Selecione que tamaño de matriz desea operar ");
							System.out.println(""); 
							System.out.println("1)  2X2    2)  3X3    3) Volver menu anterior");
							System.out.println("");
							op = in.nextInt();
							System.out.println("");
							if(op == 1)
							{
								System.out.println("");
								System.out.println("******************************************");
								System.out.println("**                                      **");
								System.out.println("**               Matriz 2X2             **");
								System.out.println("**                                      **");
								System.out.println("******************************************");
								System.out.println("");
								System.out.println("Ingrse valor i de ecuación 1:  ");
								System.out.println("");
								m1 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor j de ecuación 1:  ");
								System.out.println("");
								m2 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor i de ecuación 2:  ");
								System.out.println("");
								m3 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor j de ecuacion 2:  ");
								System.out.println("");
								m4 = in.nextInt();
								valores [0][0] = m1;
								valores [0][1] = m2;
								valores [1][0] = m3;
								valores [1][1] = m4;
								System.out.println("");
								System.out.print("[" + valores [0][0] + "]");
								System.out.println("[" + valores [0][1] + "]");
								System.out.print("[" + valores [1][0] + "]");
								System.out.print("[" + valores [1][1] + "]");
								System.out.print("");
							}
							else if(op == 2)
							{
								System.out.println("");
								System.out.println("******************************************");
								System.out.println("**                                      **");
								System.out.println("**               Matriz 3X3             **");
								System.out.println("**                                      **");
								System.out.println("******************************************");
								System.out.println("");
								System.out.println("Ingrse valor i de ecuación 1:  ");
								System.out.println("");
								m1 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor j de ecuación 1:  ");
								System.out.println("");
								m2 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor k de ecuación 1:  ");
								System.out.println("");
								m3 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor i de ecuacion 2:  ");
								System.out.println("");
								m4 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese valor j de ecuacion 2:  ");
								System.out.println("");
								m5 = in.nextInt();
								System.out.println("");
								System.out.println("Ingrese el valor k de ecuacion 2:  ");
								System.out.println("");
								m6 = in.nextInt();
								System.out.println("");
								System.out.print("[" + valores1[0][0] + "]");
							}
							else if(op > 3)
							{
								System.out.println("");
								System.out.println("Error, La opcion no existe...");
								System.out.println("");
							}
							else if(op == 3)
							{
								break;
							}
						}
						while(true);
					}
					else if(op == 5) // Menu Operaciones Avanzadas
					{
						do
						{
							System.out.println("");
							System.out.println("******************************************");
							System.out.println("**                                      **");
							System.out.println("**        Operaciones Avanzadas         **");
							System.out.println("**                                      **");
							System.out.println("**     1)      Factorial N              **");
							System.out.println("**                                      **");
							System.out.println("**     2)      Fibonacci                **");
							System.out.println("**                                      **");
							System.out.println("**     3) Regresar al menu anterior     **");
							System.out.println("**                                      **");
							System.out.println("******************************************");
							System.out.println("");
							op = in.nextInt();
							System.out.println("");
							if(op == 1) // Factorial N
							{
								double f2 = 1;
								int f1 = 0;
								System.out.println("");
								System.out.println("******************************************");
								System.out.println("**                                      **");
								System.out.println("**              Factorial N             **");
								System.out.println("**                                      **");
								System.out.println("******************************************");
								System.out.println("");
								System.out.println("Ingrese un numero N dentro del rango (1 - 100)");
								System.out.println("");
								f1 = in.nextInt();
								System.out.print("");
								if((f1 >= 1)&&(f1 <= 100)) 
								{
									System.out.println("");
									System.out.println("La sucesión Factorial es:  ");
									System.out.println("");
									for(int i = f1; i > 0; i--)
									{
										f2 = f2 * i;
									}
									System.out.print(f2);
									System.out.println("");
								}
								else if(f1 < 1)
								{
									System.out.println("");
									System.out.println("Error, numero fuera del rango (1 - 100)...");
									System.out.println("");
								}
								else if(f1 > 100)
								{
									System.out.println("");
									System.out.println("Error, numero fuera del rango (1 - 100)...");
									System.out.println("");
								}
							}
							else if(op == 2) // Fibonacci
							{
								double f1 = 0, f2 = 1, f4 = 100;
								double f3;
								System.out.println("");
								System.out.println("******************************************");
								System.out.println("**                                      **");
								System.out.println("**               Fibonacci              **");
								System.out.println("**                                      **");
								System.out.println("******************************************");
								System.out.println("");
								System.out.println("Ingrese un numero dentro del rango (1 - 100)");
								System.out.println("");
								f1 = in.nextDouble();
								System.out.print("");
								if((f1 >= 1)&&(f1 <= 100))
								{
									System.out.println(f1);
									System.out.println(f2);
									while(f2 + f1 <= f4)
									{
										f3 = f1;
										f1 = f2;
										f2 = f3 + f1;
										System.out.println(f2);
									}
								}
								else if(f1 < 1)
								{
									System.out.println("");
									System.out.println("Error, numero fuera del rango (1 - 100)...");
									System.out.println("");
								}
								else if(f1 > 100)
								{
									System.out.println("");
									System.out.println("Error, numero fuera del rango (1 - 100)...");
									System.out.println("");
								}	
															
							}
							else if(op == 3) //Regresa menu anterior 
							{
								break;
							}
							else if(op > 3)
							{
								System.out.println("");
								System.out.println("Error, La opcion no esta disponible");
								System.out.println("");
							}
						}
						while(true);
					}
					else if (op == 6)
					{
						break;
					}
					else if(op > 6)
					{
						System.out.println("");
						System.out.println("Error, La opcion no esta disponible");
						System.out.println("");
					}
				}
				while(true);
			}
			else if(op ==2)
			{
				System.out.println("");
				System.out.println("Saliendo del programa...");
				System.out.println("");
				System.exit(0);
			}
			else if(op > 2)
			{
				
				System.out.println("");
				System.out.println("Error, La opcion no esta disponible");
				System.out.println("");
			}
		}
		while(true);
	}
}