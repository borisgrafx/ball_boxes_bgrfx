package com.polytech.utils;

import kotlin.text.Charsets;

import java.io.*;
import java.util.StringTokenizer;

public class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner(InputStreamReader i) {
        br = new BufferedReader(i);
    }

    public FastScanner(InputStream i) {
        this(new InputStreamReader(i, Charsets.UTF_8));
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

}