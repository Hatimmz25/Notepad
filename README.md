# 📝 Modern Java Text Editor

> **Professional Desktop Application** - A robust text editing solution built with Java Swing, featuring multi-document support and powerful formatting tools.


## ✨ Core Capabilities

### 📂 **Document Handling**
- **Tabbed Workspace** - Edit multiple files in a single window with tab-based navigation
- **Intelligent File Operations** - Open, save, and export documents while preserving all formatting
- **Format Preservation** - Maintains fonts, colors, and styles when saving files
- **Quick Save Functionality** - Instant document saving with keyboard shortcuts
- **Bulk Save Operations** - Save all open documents with a single command

### 🎨 **Text Styling & Appearance**
- **Extensive Font Library** - Choose from 20+ typefaces including Arial, Helvetica, and Times New Roman
- **Flexible Sizing** - Scale text from 8 to 72 points for optimal readability
- **Custom Colors** - Apply any color to text or background using the built-in color picker
- **Visual Themes** - Switch between light and dark interface modes
- **Real-time Preview** - See changes instantly as you customize formatting

### ✏️ **Editing Tools**
- **Clipboard Integration** - Full support for cut, copy, and paste operations
- **View Scaling** - Increase or decrease text size for comfortable viewing
- **Multi-Instance Support** - Launch multiple editor windows for parallel editing

### ⌨️ **Productivity Shortcuts**

| Command | Function |
|---------|----------|
| `Ctrl+N` | Create new tab |
| `Ctrl+Shift+N` | Launch new window |
| `Ctrl+O` | Browse and open file |
| `Ctrl+S` | Quick save current document |
| `Ctrl+Shift+S` | Save with new name |
| `Ctrl+Alt+S` | Batch save all documents |
| `Ctrl+X` | Cut selection |
| `Ctrl+C` | Copy selection |
| `Ctrl+V` | Paste from clipboard |
| `Ctrl+Shift+F` | Open font customization |
| `Ctrl+W` | Close active tab |
| `Ctrl+Shift+W` | Exit window |
| `Ctrl+Space` | Increase zoom |
| `Ctrl+-` | Decrease zoom |

## 🚀 Quick Setup

### System Requirements
- Java Development Kit (JDK) 8 or newer
- Compatible with any Java IDE or terminal

### Launch Instructions

1. **Compile all classes**
   ```bash
   javac *.java
   ```

2. **Start the application**
   ```bash
   java program
   ```

## 📁 Code Organization

```
text-editor-project/
├── program.java          # Application launcher
├── Window.java           # Primary window frame
├── MainPanel.java        # Document container component
├── Zone.java             # Core text editing widget
├── Tabs.java             # Multi-tab controller
├── MyMenu.java           # Top menu bar
├── FileMenu.java         # File operation handlers
├── EditMenu.java         # Edit command handlers
├── ViewMenu.java         # Display control handlers
├── FileOperations.java   # Disk I/O utilities
├── FFont.java            # Font selector window
├── FontPanel.java        # Font configuration interface
└── FontStyleChooser.java # Style picker component
```

---

**⭐ If this project helped you understand Java Swing, please star the repository!**

*Keep Building! 🚀*
