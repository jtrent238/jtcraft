/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.io.Charsets;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class beg
/*     */   extends bdw
/*     */ {
/*  20 */   private static final Logger a = ;
/*  21 */   private static final bqx f = new bqx("textures/gui/title/minecraft.png");
/*  22 */   private static final bqx g = new bqx("textures/misc/vignette.png");
/*     */   
/*     */   private int h;
/*     */   private List i;
/*     */   private int r;
/*  27 */   private float s = 0.5F;
/*     */   
/*     */   public void e()
/*     */   {
/*  31 */     this.h += 1;
/*  32 */     float f1 = (this.r + this.m + this.m + 24) / this.s;
/*  33 */     if (this.h > f1) {
/*  34 */       a();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  40 */     if (paramInt == 1) {
/*  41 */       a();
/*     */     }
/*     */   }
/*     */   
/*     */   private void a() {
/*  46 */     this.k.h.a.a(new is(it.a));
/*  47 */     this.k.a(null);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  52 */     return true;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  57 */     if (this.i != null) { return;
/*     */     }
/*  59 */     this.i = new ArrayList();
/*     */     try {
/*  61 */       String str1 = "";
/*  62 */       String str2 = "" + a.p + a.q + a.k + a.l;
/*  63 */       int j = 274;
/*  64 */       BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.k.Q().a(new bqx("texts/end.txt")).b(), Charsets.UTF_8));
/*  65 */       Random localRandom = new Random(8124371L);
/*  66 */       while ((str1 = localBufferedReader.readLine()) != null) {
/*  67 */         str1 = str1.replaceAll("PLAYERNAME", this.k.M().c());
/*     */         
/*  69 */         while (str1.contains(str2)) {
/*  70 */           k = str1.indexOf(str2);
/*  71 */           String str3 = str1.substring(0, k);
/*  72 */           String str4 = str1.substring(k + str2.length());
/*  73 */           str1 = str3 + a.p + a.q + "XXXXXXXX".substring(0, localRandom.nextInt(4) + 3) + str4;
/*     */         }
/*  75 */         this.i.addAll(this.k.l.c(str1, j));
/*  76 */         this.i.add("");
/*     */       }
/*     */       
/*  79 */       for (int k = 0; k < 8; k++) {
/*  80 */         this.i.add("");
/*     */       }
/*     */       
/*  83 */       localBufferedReader = new BufferedReader(new InputStreamReader(this.k.Q().a(new bqx("texts/credits.txt")).b(), Charsets.UTF_8));
/*  84 */       while ((str1 = localBufferedReader.readLine()) != null) {
/*  85 */         str1 = str1.replaceAll("PLAYERNAME", this.k.M().c());
/*  86 */         str1 = str1.replaceAll("\t", "    ");
/*     */         
/*  88 */         this.i.addAll(this.k.l.c(str1, j));
/*  89 */         this.i.add("");
/*     */       }
/*     */       
/*  92 */       this.r = (this.i.size() * 12);
/*     */     } catch (Exception localException) {
/*  94 */       a.error("Couldn't load credits", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(int paramInt1, int paramInt2, float paramFloat) {
/*  99 */     bmh localbmh = bmh.a;
/*     */     
/* 101 */     this.k.P().a(bbw.b);
/* 102 */     localbmh.b();
/* 103 */     localbmh.a(1.0F, 1.0F, 1.0F, 1.0F);
/* 104 */     int j = this.l;
/* 105 */     float f1 = 0.0F - (this.h + paramFloat) * 0.5F * this.s;
/* 106 */     float f2 = this.m - (this.h + paramFloat) * 0.5F * this.s;
/* 107 */     float f3 = 0.015625F;
/*     */     
/* 109 */     float f4 = (this.h + paramFloat - 0.0F) * 0.02F;
/*     */     
/* 111 */     float f5 = (this.r + this.m + this.m + 24) / this.s;
/* 112 */     float f6 = (f5 - 20.0F - (this.h + paramFloat)) * 0.005F;
/* 113 */     if (f6 < f4) f4 = f6;
/* 114 */     if (f4 > 1.0F) f4 = 1.0F;
/* 115 */     f4 *= f4;
/* 116 */     f4 = f4 * 96.0F / 255.0F;
/* 117 */     localbmh.b(f4, f4, f4);
/* 118 */     localbmh.a(0.0D, this.m, this.e, 0.0D, f1 * f3);
/* 119 */     localbmh.a(j, this.m, this.e, j * f3, f1 * f3);
/* 120 */     localbmh.a(j, 0.0D, this.e, j * f3, f2 * f3);
/* 121 */     localbmh.a(0.0D, 0.0D, this.e, 0.0D, f2 * f3);
/* 122 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 127 */     b(paramInt1, paramInt2, paramFloat);
/* 128 */     bmh localbmh = bmh.a;
/*     */     
/* 130 */     int j = 274;
/* 131 */     int k = this.l / 2 - j / 2;
/* 132 */     int m = this.m + 50;
/*     */     
/* 134 */     float f1 = -(this.h + paramFloat) * this.s;
/* 135 */     GL11.glPushMatrix();
/* 136 */     GL11.glTranslatef(0.0F, f1, 0.0F);
/* 137 */     this.k.P().a(f);
/* 138 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 139 */     b(k, m, 0, 0, 155, 44);
/* 140 */     b(k + 155, m, 0, 45, 155, 44);
/* 141 */     localbmh.c(16777215);
/* 142 */     int n = m + 200;
/*     */     
/* 144 */     for (int i1 = 0; i1 < this.i.size(); i1++) {
/* 145 */       if (i1 == this.i.size() - 1) {
/* 146 */         float f2 = n + f1 - (this.m / 2 - 6);
/* 147 */         if (f2 < 0.0F) {
/* 148 */           GL11.glTranslatef(0.0F, -f2, 0.0F);
/*     */         }
/*     */       }
/* 151 */       if ((n + f1 + 12.0F + 8.0F > 0.0F) && (n + f1 < this.m)) {
/* 152 */         String str = (String)this.i.get(i1);
/* 153 */         if (str.startsWith("[C]")) {
/* 154 */           this.q.a(str.substring(3), k + (j - this.q.a(str.substring(3))) / 2, n, 16777215);
/*     */         } else {
/* 156 */           this.q.b.setSeed(i1 * 4238972211L + this.h / 4);
/* 157 */           this.q.a(str, k, n, 16777215);
/*     */         }
/*     */       }
/* 160 */       n += 12;
/*     */     }
/*     */     
/* 163 */     GL11.glPopMatrix();
/*     */     
/* 165 */     this.k.P().a(g);
/* 166 */     GL11.glEnable(3042);
/* 167 */     GL11.glBlendFunc(0, 769);
/* 168 */     localbmh.b();
/* 169 */     localbmh.a(1.0F, 1.0F, 1.0F, 1.0F);
/* 170 */     i1 = this.l;
/* 171 */     int i2 = this.m;
/* 172 */     localbmh.a(0.0D, i2, this.e, 0.0D, 1.0D);
/* 173 */     localbmh.a(i1, i2, this.e, 1.0D, 1.0D);
/* 174 */     localbmh.a(i1, 0.0D, this.e, 1.0D, 0.0D);
/* 175 */     localbmh.a(0.0D, 0.0D, this.e, 0.0D, 0.0D);
/* 176 */     localbmh.a();
/* 177 */     GL11.glDisable(3042);
/*     */     
/* 179 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\beg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */