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
/*     */ public class abb
/*     */   extends adb
/*     */ {
/*  22 */   private static final int[] m = { 11, 16, 15, 13 };
/*     */   
/*     */ 
/*     */ 
/*  26 */   private static final String[] n = { "leather_helmet_overlay", "leather_chestplate_overlay", "leather_leggings_overlay", "leather_boots_overlay" };
/*     */   
/*     */ 
/*     */ 
/*  30 */   public static final String[] a = { "empty_armor_slot_helmet", "empty_armor_slot_chestplate", "empty_armor_slot_leggings", "empty_armor_slot_boots" };
/*     */   
/*     */ 
/*     */ 
/*  34 */   private static final cp o = new abc();
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
/*     */   public final int b;
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
/*     */   public final int c;
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
/*     */   public final int d;
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
/*     */   private final abd p;
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
/*     */   private rf q;
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
/*     */   private rf r;
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
/*     */   public abb(abd paramabd, int paramInt1, int paramInt2)
/*     */   {
/* 119 */     this.p = paramabd;
/* 120 */     this.b = paramInt2;
/* 121 */     this.d = paramInt1;
/* 122 */     this.c = paramabd.b(paramInt2);
/* 123 */     f(paramabd.a(paramInt2));
/* 124 */     this.h = 1;
/* 125 */     a(abt.j);
/* 126 */     akm.a.a(this, o);
/*     */   }
/*     */   
/*     */   public int a(add paramadd, int paramInt)
/*     */   {
/* 131 */     if (paramInt > 0) {
/* 132 */       return 16777215;
/*     */     }
/*     */     
/* 135 */     int i = b(paramadd);
/* 136 */     if (i < 0) i = 16777215;
/* 137 */     return i;
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/* 142 */     return this.p == abd.a;
/*     */   }
/*     */   
/*     */   public int c()
/*     */   {
/* 147 */     return this.p.a();
/*     */   }
/*     */   
/*     */   public abd m_() {
/* 151 */     return this.p;
/*     */   }
/*     */   
/*     */   public boolean c_(add paramadd) {
/* 155 */     if (this.p != abd.a) return false;
/* 156 */     if (!paramadd.p()) return false;
/* 157 */     if (!paramadd.q().b("display", 10)) return false;
/* 158 */     if (!paramadd.q().m("display").b("color", 3)) { return false;
/*     */     }
/* 160 */     return true;
/*     */   }
/*     */   
/*     */   public int b(add paramadd) {
/* 164 */     if (this.p != abd.a) { return -1;
/*     */     }
/* 166 */     dh localdh1 = paramadd.q();
/* 167 */     if (localdh1 == null) return 10511680;
/* 168 */     dh localdh2 = localdh1.m("display");
/* 169 */     if (localdh2 == null) { return 10511680;
/*     */     }
/* 171 */     if (localdh2.b("color", 3)) {
/* 172 */       return localdh2.f("color");
/*     */     }
/* 174 */     return 10511680;
/*     */   }
/*     */   
/*     */ 
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 180 */     if (paramInt2 == 1) {
/* 181 */       return this.q;
/*     */     }
/* 183 */     return super.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void c(add paramadd) {
/* 187 */     if (this.p != abd.a) return;
/* 188 */     dh localdh1 = paramadd.q();
/* 189 */     if (localdh1 == null) return;
/* 190 */     dh localdh2 = localdh1.m("display");
/* 191 */     if (localdh2.c("color")) localdh2.o("color");
/*     */   }
/*     */   
/*     */   public void b(add paramadd, int paramInt) {
/* 195 */     if (this.p != abd.a) { throw new UnsupportedOperationException("Can't dye non-leather!");
/*     */     }
/* 197 */     dh localdh1 = paramadd.q();
/*     */     
/* 199 */     if (localdh1 == null) {
/* 200 */       localdh1 = new dh();
/* 201 */       paramadd.d(localdh1);
/*     */     }
/*     */     
/* 204 */     dh localdh2 = localdh1.m("display");
/* 205 */     if (!localdh1.b("display", 10)) localdh1.a("display", localdh2);
/* 206 */     localdh2.a("color", paramInt);
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd1, add paramadd2)
/*     */   {
/* 211 */     if (this.p.b() == paramadd2.b()) {
/* 212 */       return true;
/*     */     }
/* 214 */     return super.a(paramadd1, paramadd2);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 219 */     super.a(paramrg);
/*     */     
/* 221 */     if (this.p == abd.a) {
/* 222 */       this.q = paramrg.a(n[this.b]);
/*     */     }
/*     */     
/* 225 */     this.r = paramrg.a(a[this.b]);
/*     */   }
/*     */   
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/* 230 */     int i = sw.b(paramadd) - 1;
/* 231 */     add localadd = paramyz.r(i);
/*     */     
/* 233 */     if (localadd == null) {
/* 234 */       paramyz.c(i, paramadd.m());
/* 235 */       paramadd.b = 0;
/*     */     }
/*     */     
/* 238 */     return paramadd;
/*     */   }
/*     */   
/*     */   public static rf b(int paramInt) {
/* 242 */     switch (paramInt) {
/*     */     case 0: 
/* 244 */       return ade.ac.r;
/*     */     case 1: 
/* 246 */       return ade.ad.r;
/*     */     case 2: 
/* 248 */       return ade.ae.r;
/*     */     case 3: 
/* 250 */       return ade.af.r;
/*     */     }
/*     */     
/* 253 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */