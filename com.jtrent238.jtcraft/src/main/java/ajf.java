/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class ajf
/*     */ {
/*     */   private ahb b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private final boolean f;
/*  23 */   private List g = new ArrayList();
/*     */   
/*     */   public ajf(aje paramaje, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  26 */     this.b = paramahb;
/*  27 */     this.c = paramInt1;
/*  28 */     this.d = paramInt2;
/*  29 */     this.e = paramInt3;
/*     */     
/*  31 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  32 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  33 */     if (((aje)localaji).a) {
/*  34 */       this.f = true;
/*  35 */       i &= 0xFFFFFFF7;
/*     */     } else {
/*  37 */       this.f = false;
/*     */     }
/*  39 */     a(i);
/*     */   }
/*     */   
/*     */   private void a(int paramInt)
/*     */   {
/*  44 */     this.g.clear();
/*  45 */     if (paramInt == 0) {
/*  46 */       this.g.add(new agt(this.c, this.d, this.e - 1));
/*  47 */       this.g.add(new agt(this.c, this.d, this.e + 1));
/*  48 */     } else if (paramInt == 1) {
/*  49 */       this.g.add(new agt(this.c - 1, this.d, this.e));
/*  50 */       this.g.add(new agt(this.c + 1, this.d, this.e));
/*  51 */     } else if (paramInt == 2) {
/*  52 */       this.g.add(new agt(this.c - 1, this.d, this.e));
/*  53 */       this.g.add(new agt(this.c + 1, this.d + 1, this.e));
/*  54 */     } else if (paramInt == 3) {
/*  55 */       this.g.add(new agt(this.c - 1, this.d + 1, this.e));
/*  56 */       this.g.add(new agt(this.c + 1, this.d, this.e));
/*  57 */     } else if (paramInt == 4) {
/*  58 */       this.g.add(new agt(this.c, this.d + 1, this.e - 1));
/*  59 */       this.g.add(new agt(this.c, this.d, this.e + 1));
/*  60 */     } else if (paramInt == 5) {
/*  61 */       this.g.add(new agt(this.c, this.d, this.e - 1));
/*  62 */       this.g.add(new agt(this.c, this.d + 1, this.e + 1));
/*  63 */     } else if (paramInt == 6) {
/*  64 */       this.g.add(new agt(this.c + 1, this.d, this.e));
/*  65 */       this.g.add(new agt(this.c, this.d, this.e + 1));
/*  66 */     } else if (paramInt == 7) {
/*  67 */       this.g.add(new agt(this.c - 1, this.d, this.e));
/*  68 */       this.g.add(new agt(this.c, this.d, this.e + 1));
/*  69 */     } else if (paramInt == 8) {
/*  70 */       this.g.add(new agt(this.c - 1, this.d, this.e));
/*  71 */       this.g.add(new agt(this.c, this.d, this.e - 1));
/*  72 */     } else if (paramInt == 9) {
/*  73 */       this.g.add(new agt(this.c + 1, this.d, this.e));
/*  74 */       this.g.add(new agt(this.c, this.d, this.e - 1));
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/*  79 */     for (int i = 0; i < this.g.size(); i++) {
/*  80 */       ajf localajf = a((agt)this.g.get(i));
/*  81 */       if ((localajf == null) || (!localajf.a(this))) {
/*  82 */         this.g.remove(i--);
/*     */       } else {
/*  84 */         this.g.set(i, new agt(localajf.c, localajf.d, localajf.e));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3) {
/*  90 */     if (aje.b_(this.b, paramInt1, paramInt2, paramInt3)) return true;
/*  91 */     if (aje.b_(this.b, paramInt1, paramInt2 + 1, paramInt3)) return true;
/*  92 */     if (aje.b_(this.b, paramInt1, paramInt2 - 1, paramInt3)) return true;
/*  93 */     return false;
/*     */   }
/*     */   
/*     */   private ajf a(agt paramagt) {
/*  97 */     if (aje.b_(this.b, paramagt.a, paramagt.b, paramagt.c)) return new ajf(this.a, this.b, paramagt.a, paramagt.b, paramagt.c);
/*  98 */     if (aje.b_(this.b, paramagt.a, paramagt.b + 1, paramagt.c)) return new ajf(this.a, this.b, paramagt.a, paramagt.b + 1, paramagt.c);
/*  99 */     if (aje.b_(this.b, paramagt.a, paramagt.b - 1, paramagt.c)) return new ajf(this.a, this.b, paramagt.a, paramagt.b - 1, paramagt.c);
/* 100 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(ajf paramajf) {
/* 104 */     for (int i = 0; i < this.g.size(); i++) {
/* 105 */       agt localagt = (agt)this.g.get(i);
/* 106 */       if ((localagt.a == paramajf.c) && (localagt.c == paramajf.e)) {
/* 107 */         return true;
/*     */       }
/*     */     }
/* 110 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(int paramInt1, int paramInt2, int paramInt3) {
/* 114 */     for (int i = 0; i < this.g.size(); i++) {
/* 115 */       agt localagt = (agt)this.g.get(i);
/* 116 */       if ((localagt.a == paramInt1) && (localagt.c == paramInt3)) {
/* 117 */         return true;
/*     */       }
/*     */     }
/* 120 */     return false;
/*     */   }
/*     */   
/*     */   protected int a() {
/* 124 */     int i = 0;
/*     */     
/* 126 */     if (a(this.c, this.d, this.e - 1)) i++;
/* 127 */     if (a(this.c, this.d, this.e + 1)) i++;
/* 128 */     if (a(this.c - 1, this.d, this.e)) i++;
/* 129 */     if (a(this.c + 1, this.d, this.e)) { i++;
/*     */     }
/* 131 */     return i;
/*     */   }
/*     */   
/*     */   private boolean b(ajf paramajf) {
/* 135 */     if (a(paramajf)) return true;
/* 136 */     if (this.g.size() == 2) {
/* 137 */       return false;
/*     */     }
/* 139 */     if (this.g.isEmpty()) {
/* 140 */       return true;
/*     */     }
/*     */     
/* 143 */     return true;
/*     */   }
/*     */   
/*     */   private void c(ajf paramajf) {
/* 147 */     this.g.add(new agt(paramajf.c, paramajf.d, paramajf.e));
/*     */     
/* 149 */     boolean bool1 = b(this.c, this.d, this.e - 1);
/* 150 */     boolean bool2 = b(this.c, this.d, this.e + 1);
/* 151 */     boolean bool3 = b(this.c - 1, this.d, this.e);
/* 152 */     boolean bool4 = b(this.c + 1, this.d, this.e);
/*     */     
/* 154 */     int i = -1;
/*     */     
/* 156 */     if ((bool1) || (bool2)) i = 0;
/* 157 */     if ((bool3) || (bool4)) i = 1;
/* 158 */     if (!this.f) {
/* 159 */       if ((bool2) && (bool4) && (!bool1) && (!bool3)) i = 6;
/* 160 */       if ((bool2) && (bool3) && (!bool1) && (!bool4)) i = 7;
/* 161 */       if ((bool1) && (bool3) && (!bool2) && (!bool4)) i = 8;
/* 162 */       if ((bool1) && (bool4) && (!bool2) && (!bool3)) i = 9;
/*     */     }
/* 164 */     if (i == 0) {
/* 165 */       if (aje.b_(this.b, this.c, this.d + 1, this.e - 1)) i = 4;
/* 166 */       if (aje.b_(this.b, this.c, this.d + 1, this.e + 1)) i = 5;
/*     */     }
/* 168 */     if (i == 1) {
/* 169 */       if (aje.b_(this.b, this.c + 1, this.d + 1, this.e)) i = 2;
/* 170 */       if (aje.b_(this.b, this.c - 1, this.d + 1, this.e)) { i = 3;
/*     */       }
/*     */     }
/* 173 */     if (i < 0) { i = 0;
/*     */     }
/* 175 */     int j = i;
/* 176 */     if (this.f) {
/* 177 */       j = this.b.e(this.c, this.d, this.e) & 0x8 | i;
/*     */     }
/*     */     
/* 180 */     this.b.a(this.c, this.d, this.e, j, 3);
/*     */   }
/*     */   
/*     */   private boolean c(int paramInt1, int paramInt2, int paramInt3) {
/* 184 */     ajf localajf = a(new agt(paramInt1, paramInt2, paramInt3));
/* 185 */     if (localajf == null) return false;
/* 186 */     localajf.b();
/* 187 */     return localajf.b(this);
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean1, boolean paramBoolean2) {
/* 191 */     boolean bool1 = c(this.c, this.d, this.e - 1);
/* 192 */     boolean bool2 = c(this.c, this.d, this.e + 1);
/* 193 */     boolean bool3 = c(this.c - 1, this.d, this.e);
/* 194 */     boolean bool4 = c(this.c + 1, this.d, this.e);
/*     */     
/* 196 */     int i = -1;
/*     */     
/* 198 */     if (((bool1) || (bool2)) && (!bool3) && (!bool4)) i = 0;
/* 199 */     if (((bool3) || (bool4)) && (!bool1) && (!bool2)) { i = 1;
/*     */     }
/* 201 */     if (!this.f) {
/* 202 */       if ((bool2) && (bool4) && (!bool1) && (!bool3)) i = 6;
/* 203 */       if ((bool2) && (bool3) && (!bool1) && (!bool4)) i = 7;
/* 204 */       if ((bool1) && (bool3) && (!bool2) && (!bool4)) i = 8;
/* 205 */       if ((bool1) && (bool4) && (!bool2) && (!bool3)) i = 9;
/*     */     }
/* 207 */     if (i == -1) {
/* 208 */       if ((bool1) || (bool2)) i = 0;
/* 209 */       if ((bool3) || (bool4)) { i = 1;
/*     */       }
/* 211 */       if (!this.f) {
/* 212 */         if (paramBoolean1) {
/* 213 */           if ((bool2) && (bool4)) i = 6;
/* 214 */           if ((bool3) && (bool2)) i = 7;
/* 215 */           if ((bool4) && (bool1)) i = 9;
/* 216 */           if ((bool1) && (bool3)) i = 8;
/*     */         } else {
/* 218 */           if ((bool1) && (bool3)) i = 8;
/* 219 */           if ((bool4) && (bool1)) i = 9;
/* 220 */           if ((bool3) && (bool2)) i = 7;
/* 221 */           if ((bool2) && (bool4)) { i = 6;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 226 */     if (i == 0) {
/* 227 */       if (aje.b_(this.b, this.c, this.d + 1, this.e - 1)) i = 4;
/* 228 */       if (aje.b_(this.b, this.c, this.d + 1, this.e + 1)) i = 5;
/*     */     }
/* 230 */     if (i == 1) {
/* 231 */       if (aje.b_(this.b, this.c + 1, this.d + 1, this.e)) i = 2;
/* 232 */       if (aje.b_(this.b, this.c - 1, this.d + 1, this.e)) { i = 3;
/*     */       }
/*     */     }
/* 235 */     if (i < 0) { i = 0;
/*     */     }
/* 237 */     a(i);
/*     */     
/* 239 */     int j = i;
/* 240 */     if (this.f) {
/* 241 */       j = this.b.e(this.c, this.d, this.e) & 0x8 | i;
/*     */     }
/*     */     
/* 244 */     if ((paramBoolean2) || (this.b.e(this.c, this.d, this.e) != j)) {
/* 245 */       this.b.a(this.c, this.d, this.e, j, 3);
/* 246 */       for (int k = 0; k < this.g.size(); k++) {
/* 247 */         ajf localajf = a((agt)this.g.get(k));
/* 248 */         if (localajf != null) {
/* 249 */           localajf.b();
/*     */           
/* 251 */           if (localajf.b(this)) {
/* 252 */             localajf.c(this);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */