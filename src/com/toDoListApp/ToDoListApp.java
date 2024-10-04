package com.toDoListApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoListApp extends JFrame {
    private DefaultListModel<String> taskListModel;  //For storing tasks
    private JList<String> taskList; // List to display tasks
    private JTextField taskField; // Field to input new tasks
    private JButton addButton, editButton, deleteButton, markCompletedButton;

    public ToDoListApp() {
        setTitle("To-Do List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Initialize components
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        editButton = new JButton("Edit Task");
        deleteButton = new JButton("Delete Task");
        markCompletedButton = new JButton("Mark as Completed");

        // Panel for task input
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Task Name:"));
        inputPanel.add(taskField);
        inputPanel.add(addButton);

        // Panel for task actions
        JPanel actionPanel = new JPanel();
        actionPanel.add(editButton);
        actionPanel.add(deleteButton);
        actionPanel.add(markCompletedButton);

        // Adding components to the JFrame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(actionPanel, BorderLayout.SOUTH);

        // Event Listeners
        addButton.addActionListener(e -> addTask());
        editButton.addActionListener(e -> editTask());
        deleteButton.addActionListener(e -> deleteTask());
        markCompletedButton.addActionListener(e -> markTaskAsCompleted());
    }

    private void addTask() {
        String task = taskField.getText().trim();
        if (!task.isEmpty()) {
            taskListModel.addElement(task); // Adds the task to the list
            taskField.setText(""); // Clears the input field after adding
        } else {
            JOptionPane.showMessageDialog(this, "Task cannot be empty!");
        }
    }
    private void editTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            String newTask = JOptionPane.showInputDialog(this, "Edit Task:", taskListModel.getElementAt(selectedIndex));
            if (newTask != null && !newTask.trim().isEmpty()) {
                taskListModel.setElementAt(newTask, selectedIndex); // Updates the selected task
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to edit.");
        }
    }
    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            taskListModel.removeElementAt(selectedIndex); // Removes the selected task
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to delete.");
        }
    }
    private void markTaskAsCompleted() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            String task = taskListModel.getElementAt(selectedIndex);
            taskListModel.setElementAt(task + " (Completed)", selectedIndex); // Appends "(Completed)" to the task
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to mark as completed.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoListApp app = new ToDoListApp();
            app.setVisible(true);
        });
    }
}

