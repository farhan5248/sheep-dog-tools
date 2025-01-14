package org.farhan.mbt.maven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Minikube {

    public static void main(String[] args) {
        System.out.println("Hello Minikube");
        Minikube minikube = new Minikube();
        try {
            // TODO Check if minikube is running
            // TODO Check if the pod is running
            // TODO Check the deployment health
            // TODO Check if the service is available

            minikube.dashboard("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void dashboard(String message) throws Exception {
        try {
            String[] addCommand = { "minikube", "dashboard" };
            runCommand(addCommand);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    protected void runCommand(String[] command) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        Process process = processBuilder.start();
        System.out.println("Sleeping for 5 seconds");
        Thread.sleep(50000);
        System.out.println("Waking up");
        process.destroy();
    }

}
