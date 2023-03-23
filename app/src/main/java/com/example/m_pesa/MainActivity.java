package com.example.m_pesa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inflate the ListView
        listView = findViewById(R.id.listview);

        // Get the array from the resources
        String[] myArray = getResources().getStringArray(R.array.my_array);

        // Create an ArrayAdapter to populate the ListView
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the clicked item
                String clickedItem = parent.getItemAtPosition(position).toString();

                if (clickedItem.equals("Mpesa")) {
                    // Get the array from the resources
                    String[] myarray = getResources().getStringArray(R.array.mpesa);

                    // Create a new adapter for the ListView
                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray);

                    // Set the adapter to a different ListView
                    ListView listView2 = findViewById(R.id.listview);
                    listView2.setAdapter(newAdapter);
                    listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            // Get the clicked item
                            String clickedItem = parent.getItemAtPosition(position).toString();

                            if (clickedItem.equals("Send Money")) {
                                // Get the array from the resources
                                String[] myarray1 = getResources().getStringArray(R.array.enterphoneno);

                                // Create a new adapter for the ListView
                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                        android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                // Set the adapter to a different ListView
                                ListView listView3 = findViewById(R.id.listview);
                                listView3.setAdapter(newAdapter);
                                listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                        String clickedItem = parent.getItemAtPosition(position).toString();
                                        if (clickedItem.equals("Enter Phone Number")){
                                            String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Enter Amount")){
                                                        String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem = parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Pin")){
                                                                    Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                    ListView listView = findViewById(R.id.listview);
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                    // Set the adapter to a different ListView

                                                                    listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                    listView.setSelection(0);


                                                                }
                                                            }
                                                        });



                                                    }
                                                }
                                            });



                                        }
                                    }
                                });

                            }
                            else  if (clickedItem.equals("Withdraw Cash")) {
                                // Get the array from the resources
                                String[] myarray1 = getResources().getStringArray(R.array.withdrawcsash);

                                // Create a new adapter for the ListView
                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                        android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                // Set the adapter to a different ListView
                                ListView listView3 = findViewById(R.id.listview);
                                listView3.setAdapter(newAdapter);
                                listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                        String clickedItem = parent.getItemAtPosition(position).toString();
                                        if (clickedItem.equals("From Agent")) {
                                            String[] myarray1 = getResources().getStringArray(R.array.enteragentno);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Enter Agent No")) {
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem = parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")) {
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")) {
                                                                                Toast.makeText(MainActivity.this, "Done.. Transaction Successful", Toast.LENGTH_SHORT).show();

                                                                            }
                                                                        }
                                                                    });


                                                                }
                                                            }
                                                        });


                                                    }
                                                }
                                            });


                                        }else if (clickedItem.equals("From ATM")) {
                                            String[] myarray1 = getResources().getStringArray(R.array.enteragentno);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Enter Agent No")) {
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem = parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")) {
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")) {
                                                                                Toast.makeText(MainActivity.this, "Done.. Transaction Successful", Toast.LENGTH_SHORT).show();

                                                                            }
                                                                        }
                                                                    });


                                                                }
                                                            }
                                                        });


                                                    }
                                                }
                                            });


                                        }

                                    }
                                });

                            }
                            else if (clickedItem.equals("Buy Airtime")) {
                                // Get the array from the resources
                                String[] myarray1 = getResources().getStringArray(R.array.buyairtime);

                                // Create a new adapter for the ListView
                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                        android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                // Set the adapter to a different ListView
                                ListView listView3 = findViewById(R.id.listview);
                                listView3.setAdapter(newAdapter);
                                listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                        String clickedItem = parent.getItemAtPosition(position).toString();
                                        if (clickedItem.equals("My Phone")){
                                            String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Enter Amount")){
                                                        String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem = parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Pin")){
                                                                    Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                    ListView listView = findViewById(R.id.listview);
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                    // Set the adapter to a different ListView

                                                                    listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                    listView.setSelection(0);


                                                                }
                                                            }
                                                        });



                                                    }
                                                }
                                            });



                                        }
                                        else if (clickedItem.equals("Other Phone")) {
                                            // Get the array from the resources
                                            String[] myarray1 = getResources().getStringArray(R.array.enterphoneno);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Enter Phone Number")){
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem = parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")){
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")){
                                                                                Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                                ListView listView = findViewById(R.id.listview);
                                                                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                                        android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                                // Set the adapter to a different ListView

                                                                                listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                                listView.setSelection(0);


                                                                            }
                                                                        }
                                                                    });



                                                                }
                                                            }
                                                        });



                                                    }
                                                }
                                            });

                                        }


                                    }
                                });

                            }
                            else  if (clickedItem.equals("Loans and Savings")) {
                                // Get the array from the resources
                                String[] myarray1 = getResources().getStringArray(R.array.loansnsavings);


                                // Create a new adapter for the ListView
                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                        android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                // Set the adapter to a different ListView
                                ListView listView3 = findViewById(R.id.listview);
                                listView3.setAdapter(newAdapter);
                                listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                    @Override
                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                        String clickedItem = parent.getItemAtPosition(position).toString();
                                        if (clickedItem.equals("Kcb M-PESA")) {
                                            String[] myarray1 = getResources().getStringArray(R.array.kcbmpesa);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Withdraw to M-PESA")) {
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem=parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")){
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")){
                                                                                Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                                ListView listView = findViewById(R.id.listview);
                                                                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                                        android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                                // Set the adapter to a different ListView

                                                                                listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                                listView.setSelection(0);


                                                                            }
                                                                        }
                                                                    });



                                                                }

                                                            }
                                                        });
                                                    }
                                                    else if (clickedItem.equals("Deposit from M-PESA")) {
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem=parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")){
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")){
                                                                                Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                                ListView listView = findViewById(R.id.listview);
                                                                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                                        android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                                // Set the adapter to a different ListView

                                                                                listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                                listView.setSelection(0);


                                                                            }
                                                                        }
                                                                    });



                                                                }

                                                            }
                                                        });
                                                    }
                                                    else if (clickedItem.equals("Loan @ 8.64% for 30 days")) {
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem=parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")){
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")){
                                                                                Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                                ListView listView = findViewById(R.id.listview);
                                                                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                                        android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                                // Set the adapter to a different ListView

                                                                                listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                                listView.setSelection(0);


                                                                            }
                                                                        }
                                                                    });



                                                                }

                                                            }
                                                        });
                                                    }
                                                }
                                            });
                                        }
                                        else if (clickedItem.equals("M-Shwari")) {
                                            String[] myarray1 = getResources().getStringArray(R.array.mshwari);

                                            // Create a new adapter for the ListView
                                            ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                    android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                            // Set the adapter to a different ListView
                                            ListView listView3 = findViewById(R.id.listview);
                                            listView3.setAdapter(newAdapter);
                                            listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String clickedItem = parent.getItemAtPosition(position).toString();
                                                    if (clickedItem.equals("Send to M-Shwari")) {
                                                        String[] myarray1 = getResources().getStringArray(R.array.enteramount);

                                                        // Create a new adapter for the ListView
                                                        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                        // Set the adapter to a different ListView
                                                        ListView listView3 = findViewById(R.id.listview);
                                                        listView3.setAdapter(newAdapter);
                                                        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                String clickedItem=parent.getItemAtPosition(position).toString();
                                                                if (clickedItem.equals("Enter Amount")){
                                                                    String[] myarray1 = getResources().getStringArray(R.array.enterpin);

                                                                    // Create a new adapter for the ListView
                                                                    ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                            android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                                                    // Set the adapter to a different ListView
                                                                    ListView listView3 = findViewById(R.id.listview);
                                                                    listView3.setAdapter(newAdapter);
                                                                    listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                        @Override
                                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                            String clickedItem = parent.getItemAtPosition(position).toString();
                                                                            if (clickedItem.equals("Enter Pin")){
                                                                                Toast.makeText(MainActivity.this, "Done Transaction Successful", Toast.LENGTH_SHORT).show();
                                                                                ListView listView = findViewById(R.id.listview);
                                                                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                                                                        android.R.layout.simple_list_item_1, android.R.id.text1, myArray);

                                                                                // Set the adapter to a different ListView

                                                                                listView.setAdapter(adapter);

// scroll to the first item of the first ListView
                                                                                listView.setSelection(0);


                                                                            }
                                                                        }
                                                                    });



                                                                }

                                                            }
                                                        });
                                                    }
                                                }
                                            });
                                        }

                                    }
                                    });


                            }
                            else  if (clickedItem.equals("Lipa na M-PESA")) {
                                // Get the array from the resources
                                String[] myarray1 = getResources().getStringArray(R.array.lipanampesa);

                                // Create a new adapter for the ListView
                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                        android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                // Set the adapter to a different ListView
                                ListView listView3 = findViewById(R.id.listview);
                                listView3.setAdapter(newAdapter);

                            } else if (clickedItem.equals("My Account")) {
                                // Get the array from the resources
                                String[] myarray1 = getResources().getStringArray(R.array.myaccount);

                                // Create a new adapter for the ListView
                                ArrayAdapter<String> newAdapter = new ArrayAdapter<>(MainActivity.this,
                                        android.R.layout.simple_list_item_1, android.R.id.text1, myarray1);

                                // Set the adapter to a different ListView
                                ListView listView3 = findViewById(R.id.listview);
                                listView3.setAdapter(newAdapter);

                            }
                        }
                    });






                }

            }

        });

        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Highlight the selected item
                view.setBackgroundColor(Color.YELLOW);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing when no item is selected
            }
        });
    }
}


