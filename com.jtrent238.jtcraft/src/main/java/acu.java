/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum acu
/*     */ {
/*     */   private static final Map e;
/*     */   private final int f;
/*     */   private final String g;
/*     */   private rf h;
/*     */   private rf i;
/*     */   private final int j;
/*     */   private final float k;
/*     */   private final int l;
/*     */   private final float m;
/* 118 */   private boolean n = false;
/*     */   
/*     */   static
/*     */   {
/* 109 */     e = Maps.newHashMap();
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
/* 121 */     for (acu localacu : values()) {
/* 122 */       e.put(Integer.valueOf(localacu.a()), localacu);
/*     */     }
/*     */   }
/*     */   
/*     */   private acu(int paramInt2, String paramString1, int paramInt3, float paramFloat1, int paramInt4, float paramFloat2) {
/* 127 */     this.f = paramInt2;
/* 128 */     this.g = paramString1;
/* 129 */     this.j = paramInt3;
/* 130 */     this.k = paramFloat1;
/* 131 */     this.l = paramInt4;
/* 132 */     this.m = paramFloat2;
/* 133 */     this.n = true;
/*     */   }
/*     */   
/*     */   private acu(int paramInt2, String paramString1, int paramInt3, float paramFloat) {
/* 137 */     this.f = paramInt2;
/* 138 */     this.g = paramString1;
/* 139 */     this.j = paramInt3;
/* 140 */     this.k = paramFloat;
/* 141 */     this.l = 0;
/* 142 */     this.m = 0.0F;
/* 143 */     this.n = false;
/*     */   }
/*     */   
/*     */   public int a() {
/* 147 */     return this.f;
/*     */   }
/*     */   
/*     */   public String b() {
/* 151 */     return this.g;
/*     */   }
/*     */   
/*     */   public int c() {
/* 155 */     return this.j;
/*     */   }
/*     */   
/*     */   public float d() {
/* 159 */     return this.k;
/*     */   }
/*     */   
/*     */   public int e() {
/* 163 */     return this.l;
/*     */   }
/*     */   
/*     */   public float f() {
/* 167 */     return this.m;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {
/* 171 */     this.h = paramrg.a("fish_" + this.g + "_raw");
/*     */     
/* 173 */     if (this.n) {
/* 174 */       this.i = paramrg.a("fish_" + this.g + "_cooked");
/*     */     }
/*     */   }
/*     */   
/*     */   public rf g() {
/* 179 */     return this.h;
/*     */   }
/*     */   
/*     */   public rf h() {
/* 183 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 187 */     return this.n;
/*     */   }
/*     */   
/*     */   public static acu a(int paramInt) {
/* 191 */     acu localacu = (acu)e.get(Integer.valueOf(paramInt));
/*     */     
/* 193 */     if (localacu == null) {
/* 194 */       return a;
/*     */     }
/* 196 */     return localacu;
/*     */   }
/*     */   
/*     */   public static acu a(add paramadd)
/*     */   {
/* 201 */     if ((paramadd.b() instanceof act)) {
/* 202 */       return a(paramadd.k());
/*     */     }
/* 204 */     return a;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */