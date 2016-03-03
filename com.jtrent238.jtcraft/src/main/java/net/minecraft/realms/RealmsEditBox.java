/*     */ package net.minecraft.realms;
/*     */ 
/*     */ import bao;
/*     */ import bbu;
/*     */ import bbw;
/*     */ import bdw;
/*     */ import bmh;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import t;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RealmsEditBox
/*     */ {
/*     */   public static final int BACKWARDS = -1;
/*     */   public static final int FORWARDS = 1;
/*     */   private static final int CURSOR_INSERT_WIDTH = 1;
/*     */   private static final int CURSOR_INSERT_COLOR = -3092272;
/*     */   private static final String CURSOR_APPEND_CHARACTER = "_";
/*     */   private final bbu font;
/*     */   private final int x;
/*     */   private final int y;
/*     */   private final int width;
/*     */   private final int height;
/*  26 */   private String value = "";
/*  27 */   private int maxLength = 32;
/*     */   private int frame;
/*  29 */   private boolean bordered = true;
/*  30 */   private boolean canLoseFocus = true;
/*     */   private boolean inFocus;
/*  32 */   private boolean isEditable = true;
/*     */   private int displayPos;
/*     */   private int cursorPos;
/*     */   private int highlightPos;
/*  36 */   private int textColor = 14737632;
/*  37 */   private int textColorUneditable = 7368816;
/*  38 */   private boolean visible = true;
/*     */   
/*     */   public RealmsEditBox(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  41 */     this(bao.B().l, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public RealmsEditBox(bbu parambbu, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  45 */     this.font = parambbu;
/*  46 */     this.x = paramInt1;
/*  47 */     this.y = paramInt2;
/*  48 */     this.width = paramInt3;
/*  49 */     this.height = paramInt4;
/*     */   }
/*     */   
/*     */   public void tick() {
/*  53 */     this.frame += 1;
/*     */   }
/*     */   
/*     */   public void setValue(String paramString) {
/*  57 */     if (paramString.length() > this.maxLength) {
/*  58 */       this.value = paramString.substring(0, this.maxLength);
/*     */     } else {
/*  60 */       this.value = paramString;
/*     */     }
/*     */     
/*  63 */     moveCursorToEnd();
/*     */   }
/*     */   
/*     */   public String getValue() {
/*  67 */     return this.value;
/*     */   }
/*     */   
/*     */   public String getHighlighted() {
/*  71 */     int i = this.cursorPos < this.highlightPos ? this.cursorPos : this.highlightPos;
/*  72 */     int j = this.cursorPos < this.highlightPos ? this.highlightPos : this.cursorPos;
/*     */     
/*  74 */     return this.value.substring(i, j);
/*     */   }
/*     */   
/*     */   public void insertText(String paramString) {
/*  78 */     String str1 = "";
/*  79 */     String str2 = t.a(paramString);
/*  80 */     int i = this.cursorPos < this.highlightPos ? this.cursorPos : this.highlightPos;
/*  81 */     int j = this.cursorPos < this.highlightPos ? this.highlightPos : this.cursorPos;
/*  82 */     int k = this.maxLength - this.value.length() - (i - this.highlightPos);
/*  83 */     int m = 0;
/*     */     
/*  85 */     if (this.value.length() > 0) { str1 = str1 + this.value.substring(0, i);
/*     */     }
/*  87 */     if (k < str2.length()) {
/*  88 */       str1 = str1 + str2.substring(0, k);
/*  89 */       m = k;
/*     */     } else {
/*  91 */       str1 = str1 + str2;
/*  92 */       m = str2.length();
/*     */     }
/*     */     
/*  95 */     if ((this.value.length() > 0) && (j < this.value.length())) { str1 = str1 + this.value.substring(j);
/*     */     }
/*  97 */     this.value = str1;
/*  98 */     moveCursor(i - this.highlightPos + m);
/*     */   }
/*     */   
/*     */   public void deleteWords(int paramInt) {
/* 102 */     if (this.value.length() == 0) { return;
/*     */     }
/* 104 */     if (this.highlightPos != this.cursorPos) {
/* 105 */       insertText("");
/* 106 */       return;
/*     */     }
/*     */     
/* 109 */     deleteChars(getWordPosition(paramInt) - this.cursorPos);
/*     */   }
/*     */   
/*     */   public void deleteChars(int paramInt) {
/* 113 */     if (this.value.length() == 0) { return;
/*     */     }
/* 115 */     if (this.highlightPos != this.cursorPos) {
/* 116 */       insertText("");
/* 117 */       return;
/*     */     }
/*     */     
/* 120 */     int i = paramInt < 0 ? 1 : 0;
/* 121 */     int j = i != 0 ? this.cursorPos + paramInt : this.cursorPos;
/* 122 */     int k = i != 0 ? this.cursorPos : this.cursorPos + paramInt;
/* 123 */     String str = "";
/*     */     
/* 125 */     if (j >= 0) { str = this.value.substring(0, j);
/*     */     }
/* 127 */     if (k < this.value.length()) { str = str + this.value.substring(k);
/*     */     }
/* 129 */     this.value = str;
/* 130 */     if (i != 0) moveCursor(paramInt);
/*     */   }
/*     */   
/*     */   public int getWordPosition(int paramInt) {
/* 134 */     return getWordPosition(paramInt, getCursorPosition());
/*     */   }
/*     */   
/*     */   public int getWordPosition(int paramInt1, int paramInt2) {
/* 138 */     return getWordPosition(paramInt1, getCursorPosition(), true);
/*     */   }
/*     */   
/*     */   public int getWordPosition(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 142 */     int i = paramInt2;
/* 143 */     int j = paramInt1 < 0 ? 1 : 0;
/* 144 */     int k = Math.abs(paramInt1);
/*     */     
/* 146 */     for (int m = 0; m < k; m++) {
/* 147 */       if (j != 0) {
/* 148 */         while ((paramBoolean) && (i > 0) && (this.value.charAt(i - 1) == ' '))
/* 149 */           i--;
/* 150 */         while ((i > 0) && (this.value.charAt(i - 1) != ' '))
/* 151 */           i--;
/*     */       }
/* 153 */       int n = this.value.length();
/*     */       
/* 155 */       i = this.value.indexOf(' ', i);
/* 156 */       if (i == -1) {
/* 157 */         i = n;
/*     */       } else {
/* 159 */         while ((paramBoolean) && (i < n) && (this.value.charAt(i) == ' ')) {
/* 160 */           i++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 165 */     return i;
/*     */   }
/*     */   
/*     */   public void moveCursor(int paramInt) {
/* 169 */     moveCursorTo(this.highlightPos + paramInt);
/*     */   }
/*     */   
/*     */   public void moveCursorTo(int paramInt) {
/* 173 */     this.cursorPos = paramInt;
/*     */     
/* 175 */     int i = this.value.length();
/* 176 */     if (this.cursorPos < 0) this.cursorPos = 0;
/* 177 */     if (this.cursorPos > i) { this.cursorPos = i;
/*     */     }
/* 179 */     setHighlightPos(this.cursorPos);
/*     */   }
/*     */   
/*     */   public void moveCursorToStart() {
/* 183 */     moveCursorTo(0);
/*     */   }
/*     */   
/*     */   public void moveCursorToEnd() {
/* 187 */     moveCursorTo(this.value.length());
/*     */   }
/*     */   
/*     */   public boolean keyPressed(char paramChar, int paramInt) {
/* 191 */     if (!this.inFocus) {
/* 192 */       return false;
/*     */     }
/*     */     
/* 195 */     switch (paramChar) {
/*     */     case '\001': 
/* 197 */       moveCursorToEnd();
/* 198 */       setHighlightPos(0);
/* 199 */       return true;
/*     */     case '\003': 
/* 201 */       bdw.e(getHighlighted());
/* 202 */       return true;
/*     */     case '\026': 
/* 204 */       if (this.isEditable) insertText(bdw.o());
/* 205 */       return true;
/*     */     case '\030': 
/* 207 */       bdw.e(getHighlighted());
/* 208 */       if (this.isEditable) insertText("");
/* 209 */       return true;
/*     */     }
/*     */     
/* 212 */     switch (paramInt) {
/*     */     case 203: 
/* 214 */       if (bdw.r()) {
/* 215 */         if (bdw.q()) {
/* 216 */           setHighlightPos(getWordPosition(-1, getHighlightPos()));
/*     */         } else {
/* 218 */           setHighlightPos(getHighlightPos() - 1);
/*     */         }
/*     */       }
/* 221 */       else if (bdw.q()) {
/* 222 */         moveCursorTo(getWordPosition(-1));
/*     */       } else {
/* 224 */         moveCursor(-1);
/*     */       }
/*     */       
/*     */ 
/* 228 */       return true;
/*     */     case 205: 
/* 230 */       if (bdw.r()) {
/* 231 */         if (bdw.q()) {
/* 232 */           setHighlightPos(getWordPosition(1, getHighlightPos()));
/*     */         } else {
/* 234 */           setHighlightPos(getHighlightPos() + 1);
/*     */         }
/*     */       }
/* 237 */       else if (bdw.q()) {
/* 238 */         moveCursorTo(getWordPosition(1));
/*     */       } else {
/* 240 */         moveCursor(1);
/*     */       }
/*     */       
/*     */ 
/* 244 */       return true;
/*     */     case 14: 
/* 246 */       if (bdw.q()) {
/* 247 */         if (this.isEditable) deleteWords(-1);
/*     */       }
/* 249 */       else if (this.isEditable) { deleteChars(-1);
/*     */       }
/*     */       
/* 252 */       return true;
/*     */     
/*     */     case 211: 
/* 255 */       if (bdw.q()) {
/* 256 */         if (this.isEditable) deleteWords(1);
/*     */       }
/* 258 */       else if (this.isEditable) { deleteChars(1);
/*     */       }
/*     */       
/* 261 */       return true;
/*     */     
/*     */     case 199: 
/* 264 */       if (bdw.r()) {
/* 265 */         setHighlightPos(0);
/*     */       } else {
/* 267 */         moveCursorToStart();
/*     */       }
/*     */       
/* 270 */       return true;
/*     */     
/*     */     case 207: 
/* 273 */       if (bdw.r()) {
/* 274 */         setHighlightPos(this.value.length());
/*     */       } else {
/* 276 */         moveCursorToEnd();
/*     */       }
/*     */       
/* 279 */       return true;
/*     */     }
/*     */     
/* 282 */     if (t.a(paramChar)) {
/* 283 */       if (this.isEditable) { insertText(Character.toString(paramChar));
/*     */       }
/* 285 */       return true;
/*     */     }
/*     */     
/* 288 */     return false;
/*     */   }
/*     */   
/*     */   public void mouseClicked(int paramInt1, int paramInt2, int paramInt3) {
/* 292 */     boolean bool = (paramInt1 >= this.x) && (paramInt1 < this.x + this.width) && (paramInt2 >= this.y) && (paramInt2 < this.y + this.height);
/*     */     
/* 294 */     if (this.canLoseFocus) {
/* 295 */       setFocus(bool);
/*     */     }
/*     */     
/* 298 */     if ((this.inFocus) && (paramInt3 == 0)) {
/* 299 */       int i = paramInt1 - this.x;
/*     */       
/* 301 */       if (this.bordered) {
/* 302 */         i -= 4;
/*     */       }
/*     */       
/* 305 */       String str = this.font.a(this.value.substring(this.displayPos), getInnerWidth());
/* 306 */       moveCursorTo(this.font.a(str, i).length() + this.displayPos);
/*     */     }
/*     */   }
/*     */   
/*     */   public void render() {
/* 311 */     if (!isVisible()) { return;
/*     */     }
/* 313 */     if (isBordered()) {
/* 314 */       bbw.a(this.x - 1, this.y - 1, this.x + this.width + 1, this.y + this.height + 1, -6250336);
/* 315 */       bbw.a(this.x, this.y, this.x + this.width, this.y + this.height, -16777216);
/*     */     }
/*     */     
/* 318 */     int i = this.isEditable ? this.textColor : this.textColorUneditable;
/* 319 */     int j = this.cursorPos - this.displayPos;
/* 320 */     int k = this.highlightPos - this.displayPos;
/* 321 */     String str1 = this.font.a(this.value.substring(this.displayPos), getInnerWidth());
/* 322 */     int m = (j >= 0) && (j <= str1.length()) ? 1 : 0;
/* 323 */     int n = (this.inFocus) && (this.frame / 6 % 2 == 0) && (m != 0) ? 1 : 0;
/* 324 */     int i1 = this.bordered ? this.x + 4 : this.x;
/* 325 */     int i2 = this.bordered ? this.y + (this.height - 8) / 2 : this.y;
/* 326 */     int i3 = i1;
/*     */     
/* 328 */     if (k > str1.length()) { k = str1.length();
/*     */     }
/* 330 */     if (str1.length() > 0) {
/* 331 */       String str2 = m != 0 ? str1.substring(0, j) : str1;
/* 332 */       i3 = this.font.a(str2, i3, i2, i);
/*     */     }
/*     */     
/* 335 */     int i4 = (this.cursorPos < this.value.length()) || (this.value.length() >= getMaxLength()) ? 1 : 0;
/* 336 */     int i5 = i3;
/*     */     
/* 338 */     if (m == 0) {
/* 339 */       i5 = j > 0 ? i1 + this.width : i1;
/* 340 */     } else if (i4 != 0) {
/* 341 */       i5--;
/* 342 */       i3--;
/*     */     }
/*     */     
/* 345 */     if ((str1.length() > 0) && (m != 0) && (j < str1.length())) {
/* 346 */       i3 = this.font.a(str1.substring(j), i3, i2, i);
/*     */     }
/*     */     
/* 349 */     if (n != 0) {
/* 350 */       if (i4 != 0) {
/* 351 */         bbw.a(i5, i2 - 1, i5 + 1, i2 + 1 + this.font.a, -3092272);
/*     */       } else {
/* 353 */         this.font.a("_", i5, i2, i);
/*     */       }
/*     */     }
/*     */     
/* 357 */     if (k != j) {
/* 358 */       int i6 = i1 + this.font.a(str1.substring(0, k));
/* 359 */       renderHighlight(i5, i2 - 1, i6 - 1, i2 + 1 + this.font.a);
/*     */     }
/*     */   }
/*     */   
/*     */   private void renderHighlight(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { int i;
/* 364 */     if (paramInt1 < paramInt3) {
/* 365 */       i = paramInt1;
/* 366 */       paramInt1 = paramInt3;
/* 367 */       paramInt3 = i;
/*     */     }
/* 369 */     if (paramInt2 < paramInt4) {
/* 370 */       i = paramInt2;
/* 371 */       paramInt2 = paramInt4;
/* 372 */       paramInt4 = i;
/*     */     }
/*     */     
/* 375 */     if (paramInt3 > this.x + this.width) paramInt3 = this.x + this.width;
/* 376 */     if (paramInt1 > this.x + this.width) { paramInt1 = this.x + this.width;
/*     */     }
/* 378 */     bmh localbmh = bmh.a;
/*     */     
/* 380 */     GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
/* 381 */     GL11.glDisable(3553);
/* 382 */     GL11.glEnable(3058);
/* 383 */     GL11.glLogicOp(5387);
/*     */     
/* 385 */     localbmh.b();
/* 386 */     localbmh.a(paramInt1, paramInt4, 0.0D);
/* 387 */     localbmh.a(paramInt3, paramInt4, 0.0D);
/* 388 */     localbmh.a(paramInt3, paramInt2, 0.0D);
/* 389 */     localbmh.a(paramInt1, paramInt2, 0.0D);
/* 390 */     localbmh.a();
/*     */     
/* 392 */     GL11.glDisable(3058);
/* 393 */     GL11.glEnable(3553);
/*     */   }
/*     */   
/*     */   public void setMaxLength(int paramInt) {
/* 397 */     this.maxLength = paramInt;
/*     */     
/* 399 */     if (this.value.length() > paramInt) {
/* 400 */       this.value = this.value.substring(0, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public int getMaxLength() {
/* 405 */     return this.maxLength;
/*     */   }
/*     */   
/*     */   public int getCursorPosition() {
/* 409 */     return this.cursorPos;
/*     */   }
/*     */   
/*     */   public boolean isBordered() {
/* 413 */     return this.bordered;
/*     */   }
/*     */   
/*     */   public void setBordered(boolean paramBoolean) {
/* 417 */     this.bordered = paramBoolean;
/*     */   }
/*     */   
/*     */   public int getTextColor() {
/* 421 */     return this.textColor;
/*     */   }
/*     */   
/*     */   public void setTextColor(int paramInt) {
/* 425 */     this.textColor = paramInt;
/*     */   }
/*     */   
/*     */   public int getTextColorUneditable() {
/* 429 */     return this.textColorUneditable;
/*     */   }
/*     */   
/*     */   public void setTextColorUneditable(int paramInt) {
/* 433 */     this.textColorUneditable = paramInt;
/*     */   }
/*     */   
/*     */   public void setFocus(boolean paramBoolean) {
/* 437 */     if ((paramBoolean) && (!this.inFocus))
/*     */     {
/* 439 */       this.frame = 0;
/*     */     }
/* 441 */     this.inFocus = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean isFocused() {
/* 445 */     return this.inFocus;
/*     */   }
/*     */   
/*     */   public boolean isIsEditable() {
/* 449 */     return this.isEditable;
/*     */   }
/*     */   
/*     */   public void setIsEditable(boolean paramBoolean) {
/* 453 */     this.isEditable = paramBoolean;
/*     */   }
/*     */   
/*     */   public int getHighlightPos() {
/* 457 */     return this.highlightPos;
/*     */   }
/*     */   
/*     */   public int getInnerWidth() {
/* 461 */     return isBordered() ? this.width - 8 : this.width;
/*     */   }
/*     */   
/*     */   public void setHighlightPos(int paramInt) {
/* 465 */     int i = this.value.length();
/*     */     
/* 467 */     if (paramInt > i) paramInt = i;
/* 468 */     if (paramInt < 0) { paramInt = 0;
/*     */     }
/* 470 */     this.highlightPos = paramInt;
/*     */     
/* 472 */     if (this.font != null) {
/* 473 */       if (this.displayPos > i) this.displayPos = i;
/* 474 */       int j = getInnerWidth();
/* 475 */       String str = this.font.a(this.value.substring(this.displayPos), j);
/* 476 */       int k = str.length() + this.displayPos;
/*     */       
/* 478 */       if (paramInt == this.displayPos) {
/* 479 */         this.displayPos -= this.font.a(this.value, j, true).length();
/*     */       }
/* 481 */       if (paramInt > k) {
/* 482 */         this.displayPos += paramInt - k;
/* 483 */       } else if (paramInt <= this.displayPos) {
/* 484 */         this.displayPos -= this.displayPos - paramInt;
/*     */       }
/*     */       
/* 487 */       if (this.displayPos < 0) this.displayPos = 0;
/* 488 */       if (this.displayPos > i) this.displayPos = i;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isCanLoseFocus() {
/* 493 */     return this.canLoseFocus;
/*     */   }
/*     */   
/*     */   public void setCanLoseFocus(boolean paramBoolean) {
/* 497 */     this.canLoseFocus = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean isVisible() {
/* 501 */     return this.visible;
/*     */   }
/*     */   
/*     */   public void setVisible(boolean paramBoolean) {
/* 505 */     this.visible = paramBoolean;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsEditBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */