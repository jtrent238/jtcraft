/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GL14;
/*     */ 
/*     */ 
/*     */ public class bpg
/*     */ {
/*   9 */   private static bpg a = null;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final boolean g;
/*     */   private final boolean h;
/*     */   
/*     */   private bpg(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     this.g = paramBoolean1;
/*     */     
/*  22 */     this.b = paramInt1;
/*  23 */     this.d = paramInt2;
/*     */     
/*  25 */     this.c = paramInt3;
/*  26 */     this.e = paramInt4;
/*     */     
/*  28 */     this.h = paramBoolean2;
/*  29 */     this.f = paramInt5;
/*     */   }
/*     */   
/*     */   public bpg() {
/*  33 */     this(false, true, 1, 0, 1, 0, 32774);
/*     */   }
/*     */   
/*     */   public bpg(int paramInt1, int paramInt2, int paramInt3) {
/*  37 */     this(false, false, paramInt1, paramInt2, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public bpg(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  41 */     this(true, false, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public void a() {
/*  45 */     if (equals(a)) {
/*  46 */       return;
/*     */     }
/*     */     
/*  49 */     if ((a == null) || (this.h != a.b())) {
/*  50 */       a = this;
/*  51 */       if (this.h) {
/*  52 */         GL11.glDisable(3042);
/*  53 */         return;
/*     */       }
/*  55 */       GL11.glEnable(3042);
/*     */     }
/*     */     
/*  58 */     GL14.glBlendEquation(this.f);
/*     */     
/*  60 */     if (this.g) {
/*  61 */       GL14.glBlendFuncSeparate(this.b, this.d, this.c, this.e);
/*     */     } else {
/*  63 */       GL11.glBlendFunc(this.b, this.d);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  69 */     if (this == paramObject) return true;
/*  70 */     if (!(paramObject instanceof bpg)) { return false;
/*     */     }
/*  72 */     bpg localbpg = (bpg)paramObject;
/*     */     
/*  74 */     if (this.f != localbpg.f) return false;
/*  75 */     if (this.e != localbpg.e) return false;
/*  76 */     if (this.d != localbpg.d) return false;
/*  77 */     if (this.h != localbpg.h) return false;
/*  78 */     if (this.g != localbpg.g) return false;
/*  79 */     if (this.c != localbpg.c) return false;
/*  80 */     if (this.b != localbpg.b) { return false;
/*     */     }
/*  82 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/*  87 */     int i = this.b;
/*  88 */     i = 31 * i + this.c;
/*  89 */     i = 31 * i + this.d;
/*  90 */     i = 31 * i + this.e;
/*  91 */     i = 31 * i + this.f;
/*  92 */     i = 31 * i + (this.g ? 1 : 0);
/*  93 */     i = 31 * i + (this.h ? 1 : 0);
/*  94 */     return i;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  98 */     return this.h;
/*     */   }
/*     */   
/*     */   public static bpg a(JsonObject paramJsonObject) {
/* 102 */     if (paramJsonObject == null) return new bpg();
/* 103 */     int i = 32774;
/* 104 */     int j = 1;
/* 105 */     int k = 0;
/* 106 */     int m = 1;
/* 107 */     int n = 0;
/* 108 */     int i1 = 1;
/* 109 */     int i2 = 0;
/*     */     
/* 111 */     if (pu.a(paramJsonObject, "func")) {
/* 112 */       i = a(paramJsonObject.get("func").getAsString());
/* 113 */       if (i != 32774) {
/* 114 */         i1 = 0;
/*     */       }
/*     */     }
/*     */     
/* 118 */     if (pu.a(paramJsonObject, "srcrgb")) {
/* 119 */       j = b(paramJsonObject.get("srcrgb").getAsString());
/* 120 */       if (j != 1) {
/* 121 */         i1 = 0;
/*     */       }
/*     */     }
/*     */     
/* 125 */     if (pu.a(paramJsonObject, "dstrgb")) {
/* 126 */       k = b(paramJsonObject.get("dstrgb").getAsString());
/* 127 */       if (k != 0) {
/* 128 */         i1 = 0;
/*     */       }
/*     */     }
/*     */     
/* 132 */     if (pu.a(paramJsonObject, "srcalpha")) {
/* 133 */       m = b(paramJsonObject.get("srcalpha").getAsString());
/* 134 */       if (m != 1) {
/* 135 */         i1 = 0;
/*     */       }
/* 137 */       i2 = 1;
/*     */     }
/*     */     
/* 140 */     if (pu.a(paramJsonObject, "dstalpha")) {
/* 141 */       n = b(paramJsonObject.get("dstalpha").getAsString());
/* 142 */       if (n != 0) {
/* 143 */         i1 = 0;
/*     */       }
/* 145 */       i2 = 1;
/*     */     }
/*     */     
/*     */ 
/* 149 */     if (i1 != 0) {
/* 150 */       return new bpg();
/*     */     }
/*     */     
/*     */ 
/* 154 */     if (i2 != 0) {
/* 155 */       return new bpg(j, k, m, n, i);
/*     */     }
/* 157 */     return new bpg(j, k, i);
/*     */   }
/*     */   
/*     */   private static int a(String paramString)
/*     */   {
/* 162 */     String str = paramString.trim().toLowerCase();
/*     */     
/* 164 */     if (str.equals("add"))
/* 165 */       return 32774;
/* 166 */     if (str.equals("subtract"))
/* 167 */       return 32778;
/* 168 */     if (str.equals("reversesubtract"))
/* 169 */       return 32779;
/* 170 */     if (str.equals("reverse_subtract"))
/* 171 */       return 32779;
/* 172 */     if (str.equals("min"))
/* 173 */       return 32775;
/* 174 */     if (str.equals("max")) {
/* 175 */       return 32776;
/*     */     }
/*     */     
/* 178 */     return 32774;
/*     */   }
/*     */   
/*     */   private static int b(String paramString) {
/* 182 */     String str = paramString.trim().toLowerCase();
/* 183 */     str = str.replaceAll("_", "");
/* 184 */     str = str.replaceAll("one", "1");
/* 185 */     str = str.replaceAll("zero", "0");
/* 186 */     str = str.replaceAll("minus", "-");
/*     */     
/* 188 */     if (str.equals("0"))
/* 189 */       return 0;
/* 190 */     if (str.equals("1"))
/* 191 */       return 1;
/* 192 */     if (str.equals("srccolor"))
/* 193 */       return 768;
/* 194 */     if (str.equals("1-srccolor"))
/* 195 */       return 769;
/* 196 */     if (str.equals("dstcolor"))
/* 197 */       return 774;
/* 198 */     if (str.equals("1-dstcolor"))
/* 199 */       return 775;
/* 200 */     if (str.equals("srcalpha"))
/* 201 */       return 770;
/* 202 */     if (str.equals("1-srcalpha"))
/* 203 */       return 771;
/* 204 */     if (str.equals("dstalpha"))
/* 205 */       return 772;
/* 206 */     if (str.equals("1-dstalpha")) {
/* 207 */       return 773;
/*     */     }
/* 209 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */