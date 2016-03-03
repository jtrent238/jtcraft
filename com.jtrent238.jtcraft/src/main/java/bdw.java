/*     */ import java.awt.Toolkit;
/*     */ import java.awt.datatransfer.Clipboard;
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.datatransfer.StringSelection;
/*     */ import java.awt.datatransfer.Transferable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdw
/*     */   extends bbw
/*     */ {
/*  27 */   protected static bny j = new bny();
/*     */   protected bao k;
/*     */   public int l;
/*     */   public int m;
/*  31 */   protected List n = new ArrayList();
/*  32 */   protected List o = new ArrayList();
/*     */   public boolean p;
/*     */   protected bbu q;
/*     */   private bcb a;
/*     */   private int f;
/*     */   private long g;
/*     */   private int h;
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/*  41 */     for (int i = 0; i < this.n.size(); i++) {
/*  42 */       ((bcb)this.n.get(i)).a(this.k, paramInt1, paramInt2);
/*     */     }
/*  44 */     for (i = 0; i < this.o.size(); i++) {
/*  45 */       ((bce)this.o.get(i)).a(this.k, paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt) {
/*  50 */     if (paramInt == 1) {
/*  51 */       this.k.a(null);
/*  52 */       this.k.l();
/*     */     }
/*     */   }
/*     */   
/*     */   public static String o() {
/*     */     try {
/*  58 */       Transferable localTransferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
/*  59 */       if ((localTransferable != null) && (localTransferable.isDataFlavorSupported(DataFlavor.stringFlavor))) {
/*  60 */         return (String)localTransferable.getTransferData(DataFlavor.stringFlavor);
/*     */       }
/*     */     }
/*     */     catch (Exception localException) {}
/*  64 */     return "";
/*     */   }
/*     */   
/*     */   public static void e(String paramString) {
/*     */     try {
/*  69 */       StringSelection localStringSelection = new StringSelection(paramString);
/*  70 */       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(localStringSelection, null);
/*     */     }
/*     */     catch (Exception localException) {}
/*     */   }
/*     */   
/*     */   protected void a(add paramadd, int paramInt1, int paramInt2) {
/*  76 */     List localList = paramadd.a(this.k.h, this.k.u.v);
/*     */     
/*  78 */     for (int i = 0; i < localList.size(); i++) {
/*  79 */       if (i == 0) {
/*  80 */         localList.set(i, paramadd.w().e + (String)localList.get(i));
/*     */       } else {
/*  82 */         localList.set(i, a.h + (String)localList.get(i));
/*     */       }
/*     */     }
/*     */     
/*  86 */     a(localList, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   protected void a(String paramString, int paramInt1, int paramInt2) {
/*  90 */     a(Arrays.asList(new String[] { paramString }), paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   protected void a(List paramList, int paramInt1, int paramInt2) {
/*  94 */     if (paramList.isEmpty()) { return;
/*     */     }
/*  96 */     GL11.glDisable(32826);
/*  97 */     bam.a();
/*  98 */     GL11.glDisable(2896);
/*  99 */     GL11.glDisable(2929);
/*     */     
/* 101 */     int i = 0;
/* 102 */     for (String str1 : paramList) {
/* 103 */       i3 = this.q.a(str1);
/* 104 */       if (i3 > i) { i = i3;
/*     */       }
/*     */     }
/* 107 */     int i1 = paramInt1 + 12;
/* 108 */     int i2 = paramInt2 - 12;
/*     */     
/* 110 */     int i3 = i;
/* 111 */     int i4 = 8;
/*     */     
/* 113 */     if (paramList.size() > 1) {
/* 114 */       i4 += 2 + (paramList.size() - 1) * 10;
/*     */     }
/*     */     
/*     */ 
/* 118 */     if (i1 + i > this.l) {
/* 119 */       i1 -= 28 + i;
/*     */     }
/*     */     
/*     */ 
/* 123 */     if (i2 + i4 + 6 > this.m) {
/* 124 */       i2 = this.m - i4 - 6;
/*     */     }
/*     */     
/* 127 */     this.e = 300.0F;
/* 128 */     j.f = 300.0F;
/*     */     
/* 130 */     int i5 = -267386864;
/* 131 */     a(i1 - 3, i2 - 4, i1 + i3 + 3, i2 - 3, i5, i5);
/* 132 */     a(i1 - 3, i2 + i4 + 3, i1 + i3 + 3, i2 + i4 + 4, i5, i5);
/*     */     
/* 134 */     a(i1 - 3, i2 - 3, i1 + i3 + 3, i2 + i4 + 3, i5, i5);
/* 135 */     a(i1 - 4, i2 - 3, i1 - 3, i2 + i4 + 3, i5, i5);
/* 136 */     a(i1 + i3 + 3, i2 - 3, i1 + i3 + 4, i2 + i4 + 3, i5, i5);
/*     */     
/* 138 */     int i6 = 1347420415;
/* 139 */     int i7 = (i6 & 0xFEFEFE) >> 1 | i6 & 0xFF000000;
/*     */     
/* 141 */     a(i1 - 3, i2 - 3 + 1, i1 - 3 + 1, i2 + i4 + 3 - 1, i6, i7);
/* 142 */     a(i1 + i3 + 2, i2 - 3 + 1, i1 + i3 + 3, i2 + i4 + 3 - 1, i6, i7);
/*     */     
/* 144 */     a(i1 - 3, i2 - 3, i1 + i3 + 3, i2 - 3 + 1, i6, i6);
/* 145 */     a(i1 - 3, i2 + i4 + 2, i1 + i3 + 3, i2 + i4 + 3, i7, i7);
/*     */     
/* 147 */     for (int i8 = 0; i8 < paramList.size(); i8++) {
/* 148 */       String str2 = (String)paramList.get(i8);
/*     */       
/* 150 */       this.q.a(str2, i1, i2, -1);
/*     */       
/* 152 */       if (i8 == 0) i2 += 2;
/* 153 */       i2 += 10;
/*     */     }
/*     */     
/* 156 */     this.e = 0.0F;
/* 157 */     j.f = 0.0F;
/*     */     
/* 159 */     GL11.glEnable(2896);
/* 160 */     GL11.glEnable(2929);
/* 161 */     bam.b();
/* 162 */     GL11.glEnable(32826);
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3) {
/* 166 */     if (paramInt3 == 0) {
/* 167 */       for (int i = 0; i < this.n.size(); i++) {
/* 168 */         bcb localbcb = (bcb)this.n.get(i);
/* 169 */         if (localbcb.c(this.k, paramInt1, paramInt2)) {
/* 170 */           this.a = localbcb;
/* 171 */           localbcb.a(this.k.X());
/* 172 */           a(localbcb);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3) {
/* 179 */     if ((this.a != null) && (paramInt3 == 0)) {
/* 180 */       this.a.a(paramInt1, paramInt2);
/* 181 */       this.a = null;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
/*     */   
/*     */   protected void a(bcb parambcb) {}
/*     */   
/*     */   public void a(bao parambao, int paramInt1, int paramInt2)
/*     */   {
/* 192 */     this.k = parambao;
/* 193 */     this.q = parambao.l;
/* 194 */     this.l = paramInt1;
/* 195 */     this.m = paramInt2;
/* 196 */     this.n.clear();
/* 197 */     b();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b() {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void p()
/*     */   {
/* 209 */     if (Mouse.isCreated()) {
/* 210 */       while (Mouse.next()) {
/* 211 */         k();
/*     */       }
/*     */     }
/*     */     
/* 215 */     if (Keyboard.isCreated()) {
/* 216 */       while (Keyboard.next()) {
/* 217 */         l();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void k() {
/* 223 */     int i = Mouse.getEventX() * this.l / this.k.d;
/* 224 */     int i1 = this.m - Mouse.getEventY() * this.m / this.k.e - 1;
/*     */     
/* 226 */     int i2 = Mouse.getEventButton();
/*     */     
/* 228 */     if (Mouse.getEventButtonState()) {
/* 229 */       if ((this.k.u.y) && (this.h++ > 0)) return;
/* 230 */       this.f = i2;
/* 231 */       this.g = bao.K();
/* 232 */       a(i, i1, this.f);
/* 233 */     } else if (i2 != -1) {
/* 234 */       if ((this.k.u.y) && (--this.h > 0)) return;
/* 235 */       this.f = -1;
/* 236 */       b(i, i1, i2);
/* 237 */     } else if ((this.f != -1) && (this.g > 0L)) {
/* 238 */       long l1 = bao.K() - this.g;
/* 239 */       a(i, i1, this.f, l1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void l() {
/* 244 */     if (Keyboard.getEventKeyState()) {
/* 245 */       a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
/*     */     }
/*     */     
/* 248 */     this.k.aa();
/*     */   }
/*     */   
/*     */ 
/*     */   public void e() {}
/*     */   
/*     */   public void m() {}
/*     */   
/*     */   public void c()
/*     */   {
/* 258 */     c_(0);
/*     */   }
/*     */   
/*     */   public void c_(int paramInt) {
/* 262 */     if (this.k.f != null) {
/* 263 */       a(0, 0, this.l, this.m, -1072689136, -804253680);
/*     */     } else {
/* 265 */       c(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 270 */     GL11.glDisable(2896);
/* 271 */     GL11.glDisable(2912);
/* 272 */     bmh localbmh = bmh.a;
/* 273 */     this.k.P().a(b);
/* 274 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 275 */     float f1 = 32.0F;
/* 276 */     localbmh.b();
/* 277 */     localbmh.c(4210752);
/* 278 */     localbmh.a(0.0D, this.m, 0.0D, 0.0D, this.m / f1 + paramInt);
/* 279 */     localbmh.a(this.l, this.m, 0.0D, this.l / f1, this.m / f1 + paramInt);
/* 280 */     localbmh.a(this.l, 0.0D, 0.0D, this.l / f1, paramInt);
/* 281 */     localbmh.a(0.0D, 0.0D, 0.0D, 0.0D, paramInt);
/* 282 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 286 */     return true;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt) {}
/*     */   
/*     */   public static boolean q()
/*     */   {
/* 293 */     if (bao.a) {
/* 294 */       return (Keyboard.isKeyDown(219)) || (Keyboard.isKeyDown(220));
/*     */     }
/*     */     
/* 297 */     return (Keyboard.isKeyDown(29)) || (Keyboard.isKeyDown(157));
/*     */   }
/*     */   
/*     */   public static boolean r() {
/* 301 */     return (Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */