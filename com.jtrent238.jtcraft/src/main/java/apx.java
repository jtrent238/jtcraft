/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class apx
/*      */ {
/*   25 */   private static final Logger t = ;
/*      */   
/*      */ 
/*      */   public static boolean a;
/*      */   
/*   30 */   private apz[] u = new apz[16];
/*   31 */   private byte[] v = new byte['Ā'];
/*   32 */   public int[] b = new int['Ā'];
/*   33 */   public boolean[] c = new boolean['Ā'];
/*      */   public boolean d;
/*      */   public ahb e;
/*      */   public int[] f;
/*      */   public final int g;
/*      */   public final int h;
/*      */   private boolean w;
/*   40 */   public Map i = new HashMap();
/*      */   
/*      */   public List[] j;
/*      */   
/*      */   public boolean k;
/*      */   
/*      */   public boolean l;
/*      */   public boolean m;
/*      */   public boolean n;
/*      */   public boolean o;
/*      */   public long p;
/*      */   public boolean q;
/*      */   public int r;
/*      */   public long s;
/*   54 */   private int x = 4096;
/*      */   
/*      */   public apx(ahb paramahb, int paramInt1, int paramInt2) {
/*   57 */     this.j = new List[16];
/*   58 */     this.e = paramahb;
/*   59 */     this.g = paramInt1;
/*   60 */     this.h = paramInt2;
/*   61 */     this.f = new int['Ā'];
/*   62 */     for (int i1 = 0; i1 < this.j.length; i1++) {
/*   63 */       this.j[i1] = new ArrayList();
/*      */     }
/*   65 */     Arrays.fill(this.b, 64537);
/*   66 */     Arrays.fill(this.v, (byte)-1);
/*      */   }
/*      */   
/*      */   public apx(ahb paramahb, aji[] paramArrayOfaji, int paramInt1, int paramInt2) {
/*   70 */     this(paramahb, paramInt1, paramInt2);
/*      */     
/*   72 */     int i1 = paramArrayOfaji.length / 256;
/*   73 */     boolean bool = !paramahb.t.g;
/*   74 */     for (int i2 = 0; i2 < 16; i2++) {
/*   75 */       for (int i3 = 0; i3 < 16; i3++)
/*   76 */         for (int i4 = 0; i4 < i1; i4++) {
/*   77 */           aji localaji = paramArrayOfaji[(i2 << 11 | i3 << 7 | i4)];
/*      */           
/*      */ 
/*   80 */           if ((localaji != null) && (localaji.o() != awt.a))
/*      */           {
/*      */ 
/*      */ 
/*   84 */             int i5 = i4 >> 4;
/*   85 */             if (this.u[i5] == null) {
/*   86 */               this.u[i5] = new apz(i5 << 4, bool);
/*      */             }
/*   88 */             this.u[i5].a(i2, i4 & 0xF, i3, localaji);
/*      */           }
/*      */         }
/*      */     }
/*      */   }
/*      */   
/*      */   public apx(ahb paramahb, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
/*   95 */     this(paramahb, paramInt1, paramInt2);
/*      */     
/*   97 */     int i1 = paramArrayOfaji.length / 256;
/*   98 */     boolean bool = !paramahb.t.g;
/*   99 */     for (int i2 = 0; i2 < 16; i2++) {
/*  100 */       for (int i3 = 0; i3 < 16; i3++)
/*  101 */         for (int i4 = 0; i4 < i1; i4++) {
/*  102 */           int i5 = i2 * i1 * 16 | i3 * i1 | i4;
/*  103 */           aji localaji = paramArrayOfaji[i5];
/*      */           
/*  105 */           if ((localaji != null) && (localaji != ajn.a))
/*      */           {
/*      */ 
/*      */ 
/*  109 */             int i6 = i4 >> 4;
/*  110 */             if (this.u[i6] == null) {
/*  111 */               this.u[i6] = new apz(i6 << 4, bool);
/*      */             }
/*  113 */             this.u[i6].a(i2, i4 & 0xF, i3, localaji);
/*  114 */             this.u[i6].a(i2, i4 & 0xF, i3, paramArrayOfByte[i5]);
/*      */           }
/*      */         }
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2) {
/*  121 */     return (paramInt1 == this.g) && (paramInt2 == this.h);
/*      */   }
/*      */   
/*      */   public int b(int paramInt1, int paramInt2) {
/*  125 */     return this.f[(paramInt2 << 4 | paramInt1)];
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int h()
/*      */   {
/*  139 */     for (int i1 = this.u.length - 1; i1 >= 0; i1--) {
/*  140 */       if (this.u[i1] != null) {
/*  141 */         return this.u[i1].d();
/*      */       }
/*      */     }
/*  144 */     return 0;
/*      */   }
/*      */   
/*      */   public apz[] i() {
/*  148 */     return this.u;
/*      */   }
/*      */   
/*      */   public void a() {
/*  152 */     int i1 = h();
/*  153 */     this.r = Integer.MAX_VALUE;
/*      */     
/*  155 */     for (int i2 = 0; i2 < 16; i2++) {
/*  156 */       for (int i3 = 0; i3 < 16; i3++) {
/*  157 */         this.b[(i2 + (i3 << 4))] = 64537;
/*      */         
/*  159 */         for (int i4 = i1 + 16 - 1; i4 > 0; i4--) {
/*  160 */           aji localaji = a(i2, i4 - 1, i3);
/*  161 */           if (localaji.k() != 0) {
/*  162 */             this.f[(i3 << 4 | i2)] = i4;
/*  163 */             if (i4 >= this.r) break; this.r = i4; break;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  170 */     this.n = true;
/*      */   }
/*      */   
/*      */   public void b() {
/*  174 */     int i1 = h();
/*  175 */     this.r = Integer.MAX_VALUE;
/*      */     
/*  177 */     for (int i2 = 0; i2 < 16; i2++) {
/*  178 */       for (int i3 = 0; i3 < 16; i3++) {
/*  179 */         this.b[(i2 + (i3 << 4))] = 64537;
/*      */         
/*  181 */         for (int i4 = i1 + 16 - 1; i4 > 0; i4--) {
/*  182 */           if (b(i2, i4 - 1, i3) != 0) {
/*  183 */             this.f[(i3 << 4 | i2)] = i4;
/*  184 */             if (i4 >= this.r) break; this.r = i4; break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  189 */         if (!this.e.t.g) {
/*  190 */           i4 = 15;
/*  191 */           int i5 = i1 + 16 - 1;
/*      */           do {
/*  193 */             int i6 = b(i2, i5, i3);
/*  194 */             if ((i6 == 0) && (i4 != 15)) i6 = 1;
/*  195 */             i4 -= i6;
/*      */             
/*  197 */             if (i4 > 0) {
/*  198 */               apz localapz = this.u[(i5 >> 4)];
/*  199 */               if (localapz != null) {
/*  200 */                 localapz.b(i2, i5 & 0xF, i3, i4);
/*  201 */                 this.e.m((this.g << 4) + i2, i5, (this.h << 4) + i3);
/*      */               }
/*      */             }
/*  204 */             i5--;
/*  205 */           } while ((i5 > 0) && (i4 > 0));
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  210 */     this.n = true;
/*      */   }
/*      */   
/*      */   private void e(int paramInt1, int paramInt2) {
/*  214 */     this.c[(paramInt1 + paramInt2 * 16)] = true;
/*  215 */     this.w = true;
/*      */   }
/*      */   
/*      */ 
/*      */   private void c(boolean paramBoolean)
/*      */   {
/*  221 */     this.e.C.a("recheckGaps");
/*  222 */     if (this.e.a(this.g * 16 + 8, 0, this.h * 16 + 8, 16)) {
/*  223 */       for (int i1 = 0; i1 < 16; i1++) {
/*  224 */         for (int i2 = 0; i2 < 16; i2++) {
/*  225 */           if (this.c[(i1 + i2 * 16)] != 0) {
/*  226 */             this.c[(i1 + i2 * 16)] = false;
/*  227 */             int i3 = b(i1, i2);
/*  228 */             int i4 = this.g * 16 + i1;
/*  229 */             int i5 = this.h * 16 + i2;
/*      */             
/*  231 */             int i6 = this.e.g(i4 - 1, i5);
/*  232 */             int i7 = this.e.g(i4 + 1, i5);
/*  233 */             int i8 = this.e.g(i4, i5 - 1);
/*  234 */             int i9 = this.e.g(i4, i5 + 1);
/*  235 */             if (i7 < i6) i6 = i7;
/*  236 */             if (i8 < i6) i6 = i8;
/*  237 */             if (i9 < i6) i6 = i9;
/*  238 */             g(i4, i5, i6);
/*  239 */             g(i4 - 1, i5, i3);
/*  240 */             g(i4 + 1, i5, i3);
/*  241 */             g(i4, i5 - 1, i3);
/*  242 */             g(i4, i5 + 1, i3);
/*      */             
/*  244 */             if (paramBoolean) {
/*  245 */               this.e.C.b();
/*  246 */               return;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*  251 */       this.w = false;
/*      */     }
/*  253 */     this.e.C.b();
/*      */   }
/*      */   
/*      */   private void g(int paramInt1, int paramInt2, int paramInt3) {
/*  257 */     int i1 = this.e.f(paramInt1, paramInt2);
/*      */     
/*  259 */     if (i1 > paramInt3) {
/*  260 */       c(paramInt1, paramInt2, paramInt3, i1 + 1);
/*  261 */     } else if (i1 < paramInt3) {
/*  262 */       c(paramInt1, paramInt2, i1, paramInt3 + 1);
/*      */     }
/*      */   }
/*      */   
/*      */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  267 */     if ((paramInt4 > paramInt3) && 
/*  268 */       (this.e.a(paramInt1, 0, paramInt2, 16))) {
/*  269 */       for (int i1 = paramInt3; i1 < paramInt4; i1++) {
/*  270 */         this.e.c(ahn.a, paramInt1, i1, paramInt2);
/*      */       }
/*  272 */       this.n = true;
/*      */     }
/*      */   }
/*      */   
/*      */   private void h(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  278 */     int i1 = this.f[(paramInt3 << 4 | paramInt1)] & 0xFF;
/*  279 */     int i2 = i1;
/*  280 */     if (paramInt2 > i1) { i2 = paramInt2;
/*      */     }
/*  282 */     while ((i2 > 0) && (b(paramInt1, i2 - 1, paramInt3) == 0))
/*  283 */       i2--;
/*  284 */     if (i2 == i1) { return;
/*      */     }
/*  286 */     this.e.b(paramInt1 + this.g * 16, paramInt3 + this.h * 16, i2, i1);
/*  287 */     this.f[(paramInt3 << 4 | paramInt1)] = i2;
/*      */     
/*  289 */     int i3 = this.g * 16 + paramInt1;
/*  290 */     int i4 = this.h * 16 + paramInt3;
/*  291 */     if (!this.e.t.g) { apz localapz1;
/*  292 */       if (i2 < i1) {
/*  293 */         for (i5 = i2; i5 < i1; i5++) {
/*  294 */           localapz1 = this.u[(i5 >> 4)];
/*  295 */           if (localapz1 != null) {
/*  296 */             localapz1.b(paramInt1, i5 & 0xF, paramInt3, 15);
/*  297 */             this.e.m((this.g << 4) + paramInt1, i5, (this.h << 4) + paramInt3);
/*      */           }
/*      */         }
/*      */       } else {
/*  301 */         for (i5 = i1; i5 < i2; i5++) {
/*  302 */           localapz1 = this.u[(i5 >> 4)];
/*  303 */           if (localapz1 != null) {
/*  304 */             localapz1.b(paramInt1, i5 & 0xF, paramInt3, 0);
/*  305 */             this.e.m((this.g << 4) + paramInt1, i5, (this.h << 4) + paramInt3);
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  310 */       i5 = 15;
/*  311 */       while ((i2 > 0) && (i5 > 0)) {
/*  312 */         i2--;
/*  313 */         i6 = b(paramInt1, i2, paramInt3);
/*  314 */         if (i6 == 0) i6 = 1;
/*  315 */         i5 -= i6;
/*  316 */         if (i5 < 0) { i5 = 0;
/*      */         }
/*  318 */         apz localapz2 = this.u[(i2 >> 4)];
/*  319 */         if (localapz2 != null) {
/*  320 */           localapz2.b(paramInt1, i2 & 0xF, paramInt3, i5);
/*      */         }
/*      */       }
/*      */     }
/*  324 */     int i5 = this.f[(paramInt3 << 4 | paramInt1)];
/*  325 */     int i6 = i1;
/*  326 */     int i7 = i5;
/*  327 */     if (i7 < i6) {
/*  328 */       int i8 = i6;
/*  329 */       i6 = i7;
/*  330 */       i7 = i8;
/*      */     }
/*  332 */     if (i5 < this.r) this.r = i5;
/*  333 */     if (!this.e.t.g) {
/*  334 */       c(i3 - 1, i4, i6, i7);
/*  335 */       c(i3 + 1, i4, i6, i7);
/*  336 */       c(i3, i4 - 1, i6, i7);
/*  337 */       c(i3, i4 + 1, i6, i7);
/*  338 */       c(i3, i4, i6, i7);
/*      */     }
/*      */     
/*  341 */     this.n = true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  354 */     return a(paramInt1, paramInt2, paramInt3).k();
/*      */   }
/*      */   
/*      */   public aji a(int paramInt1, int paramInt2, int paramInt3) {
/*  358 */     aji localaji = ajn.a;
/*  359 */     if (paramInt2 >> 4 < this.u.length) {
/*  360 */       apz localapz = this.u[(paramInt2 >> 4)];
/*  361 */       if (localapz != null) {
/*      */         try {
/*  363 */           localaji = localapz.a(paramInt1, paramInt2 & 0xF, paramInt3);
/*      */         } catch (Throwable localThrowable) {
/*  365 */           b localb = b.a(localThrowable, "Getting block");
/*  366 */           k localk = localb.a("Block being got");
/*      */           
/*  368 */           localk.a("Location", new apy(this, paramInt1, paramInt2, paramInt3));
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  375 */           throw new s(localb);
/*      */         }
/*      */       }
/*      */     }
/*  379 */     return localaji;
/*      */   }
/*      */   
/*      */   public int c(int paramInt1, int paramInt2, int paramInt3) {
/*  383 */     if (paramInt2 >> 4 >= this.u.length) return 0;
/*  384 */     apz localapz = this.u[(paramInt2 >> 4)];
/*  385 */     if (localapz != null) {
/*  386 */       return localapz.b(paramInt1, paramInt2 & 0xF, paramInt3);
/*      */     }
/*  388 */     return 0;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*      */   {
/*  396 */     int i1 = paramInt3 << 4 | paramInt1;
/*      */     
/*  398 */     if (paramInt2 >= this.b[i1] - 1) {
/*  399 */       this.b[i1] = 64537;
/*      */     }
/*      */     
/*  402 */     int i2 = this.f[i1];
/*      */     
/*  404 */     aji localaji = a(paramInt1, paramInt2, paramInt3);
/*  405 */     int i3 = c(paramInt1, paramInt2, paramInt3);
/*  406 */     if ((localaji == paramaji) && (i3 == paramInt4)) { return false;
/*      */     }
/*  408 */     apz localapz = this.u[(paramInt2 >> 4)];
/*  409 */     int i4 = 0;
/*  410 */     if (localapz == null)
/*      */     {
/*  412 */       if (paramaji == ajn.a) {
/*  413 */         return false;
/*      */       }
/*      */       
/*  416 */       localapz = this.u[(paramInt2 >> 4)] = new apz(paramInt2 >> 4 << 4, !this.e.t.g);
/*  417 */       i4 = paramInt2 >= i2 ? 1 : 0;
/*      */     }
/*      */     
/*  420 */     int i5 = this.g * 16 + paramInt1;
/*  421 */     int i6 = this.h * 16 + paramInt3;
/*  422 */     if (!this.e.E) {
/*  423 */       localaji.f(this.e, i5, paramInt2, i6, i3);
/*      */     }
/*      */     
/*  426 */     localapz.a(paramInt1, paramInt2 & 0xF, paramInt3, paramaji);
/*  427 */     if (!this.e.E) {
/*  428 */       localaji.a(this.e, i5, paramInt2, i6, localaji, i3);
/*  429 */     } else if (((localaji instanceof akw)) && (localaji != paramaji)) {
/*  430 */       this.e.p(i5, paramInt2, i6);
/*      */     }
/*      */     
/*  433 */     if (localapz.a(paramInt1, paramInt2 & 0xF, paramInt3) != paramaji) { return false;
/*      */     }
/*  435 */     localapz.a(paramInt1, paramInt2 & 0xF, paramInt3, paramInt4);
/*      */     
/*  437 */     if (i4 != 0) {
/*  438 */       b();
/*      */     } else {
/*  440 */       int i7 = paramaji.k();
/*  441 */       int i8 = localaji.k();
/*      */       
/*  443 */       if (i7 > 0) {
/*  444 */         if (paramInt2 >= i2) {
/*  445 */           h(paramInt1, paramInt2 + 1, paramInt3);
/*      */         }
/*      */       }
/*  448 */       else if (paramInt2 == i2 - 1) {
/*  449 */         h(paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */       
/*      */ 
/*  453 */       if (i7 != i8)
/*      */       {
/*  455 */         if ((i7 < i8) || (a(ahn.a, paramInt1, paramInt2, paramInt3) > 0) || (a(ahn.b, paramInt1, paramInt2, paramInt3) > 0)) {
/*  456 */           e(paramInt1, paramInt3);
/*      */         }
/*      */       }
/*      */     }
/*      */     aor localaor;
/*  461 */     if ((localaji instanceof akw)) {
/*  462 */       localaor = e(paramInt1, paramInt2, paramInt3);
/*  463 */       if (localaor != null) {
/*  464 */         localaor.u();
/*      */       }
/*      */     }
/*      */     
/*  468 */     if (!this.e.E) paramaji.b(this.e, i5, paramInt2, i6);
/*  469 */     if ((paramaji instanceof akw)) {
/*  470 */       localaor = e(paramInt1, paramInt2, paramInt3);
/*  471 */       if (localaor == null) {
/*  472 */         localaor = ((akw)paramaji).a(this.e, paramInt4);
/*  473 */         this.e.a(i5, paramInt2, i6, localaor);
/*      */       }
/*      */       
/*  476 */       if (localaor != null) {
/*  477 */         localaor.u();
/*      */       }
/*      */     }
/*      */     
/*  481 */     this.n = true;
/*  482 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  487 */     apz localapz = this.u[(paramInt2 >> 4)];
/*  488 */     if (localapz == null) {
/*  489 */       return false;
/*      */     }
/*      */     
/*  492 */     int i1 = localapz.b(paramInt1, paramInt2 & 0xF, paramInt3);
/*  493 */     if (i1 == paramInt4) {
/*  494 */       return false;
/*      */     }
/*      */     
/*  497 */     this.n = true;
/*  498 */     localapz.a(paramInt1, paramInt2 & 0xF, paramInt3, paramInt4);
/*  499 */     if ((localapz.a(paramInt1, paramInt2 & 0xF, paramInt3) instanceof akw)) {
/*  500 */       aor localaor = e(paramInt1, paramInt2, paramInt3);
/*  501 */       if (localaor != null) {
/*  502 */         localaor.u();
/*  503 */         localaor.g = paramInt4;
/*      */       }
/*      */     }
/*  506 */     return true;
/*      */   }
/*      */   
/*      */   public int a(ahn paramahn, int paramInt1, int paramInt2, int paramInt3) {
/*  510 */     apz localapz = this.u[(paramInt2 >> 4)];
/*  511 */     if (localapz == null) {
/*  512 */       if (d(paramInt1, paramInt2, paramInt3)) {
/*  513 */         return paramahn.c;
/*      */       }
/*  515 */       return 0;
/*      */     }
/*      */     
/*      */ 
/*  519 */     if (paramahn == ahn.a) {
/*  520 */       if (this.e.t.g) {
/*  521 */         return 0;
/*      */       }
/*  523 */       return localapz.c(paramInt1, paramInt2 & 0xF, paramInt3); }
/*  524 */     if (paramahn == ahn.b) return localapz.d(paramInt1, paramInt2 & 0xF, paramInt3);
/*  525 */     return paramahn.c;
/*      */   }
/*      */   
/*      */   public void a(ahn paramahn, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  530 */     apz localapz = this.u[(paramInt2 >> 4)];
/*  531 */     if (localapz == null) {
/*  532 */       localapz = this.u[(paramInt2 >> 4)] = new apz(paramInt2 >> 4 << 4, !this.e.t.g);
/*  533 */       b();
/*      */     }
/*      */     
/*  536 */     this.n = true;
/*  537 */     if (paramahn == ahn.a) {
/*  538 */       if (!this.e.t.g) {
/*  539 */         localapz.b(paramInt1, paramInt2 & 0xF, paramInt3, paramInt4);
/*      */       }
/*      */     }
/*  542 */     else if (paramahn == ahn.b) {
/*  543 */       localapz.c(paramInt1, paramInt2 & 0xF, paramInt3, paramInt4);
/*      */     }
/*      */   }
/*      */   
/*      */   public int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  548 */     apz localapz = this.u[(paramInt2 >> 4)];
/*  549 */     if (localapz == null) {
/*  550 */       if ((!this.e.t.g) && (paramInt4 < ahn.a.c)) {
/*  551 */         return ahn.a.c - paramInt4;
/*      */       }
/*  553 */       return 0;
/*      */     }
/*      */     
/*  556 */     int i1 = this.e.t.g ? 0 : localapz.c(paramInt1, paramInt2 & 0xF, paramInt3);
/*  557 */     if (i1 > 0) a = true;
/*  558 */     i1 -= paramInt4;
/*  559 */     int i2 = localapz.d(paramInt1, paramInt2 & 0xF, paramInt3);
/*  560 */     if (i2 > i1) { i1 = i2;
/*      */     }
/*  562 */     return i1;
/*      */   }
/*      */   
/*      */   public void a(sa paramsa) {
/*  566 */     this.o = true;
/*      */     
/*  568 */     int i1 = qh.c(paramsa.s / 16.0D);
/*  569 */     int i2 = qh.c(paramsa.u / 16.0D);
/*  570 */     if ((i1 != this.g) || (i2 != this.h)) {
/*  571 */       t.warn("Wrong location! " + paramsa + " (at " + i1 + ", " + i2 + " instead of " + this.g + ", " + this.h + ")");
/*  572 */       Thread.dumpStack();
/*      */     }
/*  574 */     int i3 = qh.c(paramsa.t / 16.0D);
/*  575 */     if (i3 < 0) i3 = 0;
/*  576 */     if (i3 >= this.j.length) i3 = this.j.length - 1;
/*  577 */     paramsa.ag = true;
/*  578 */     paramsa.ah = this.g;
/*  579 */     paramsa.ai = i3;
/*  580 */     paramsa.aj = this.h;
/*  581 */     this.j[i3].add(paramsa);
/*      */   }
/*      */   
/*      */   public void b(sa paramsa) {
/*  585 */     a(paramsa, paramsa.ai);
/*      */   }
/*      */   
/*      */   public void a(sa paramsa, int paramInt) {
/*  589 */     if (paramInt < 0) paramInt = 0;
/*  590 */     if (paramInt >= this.j.length) paramInt = this.j.length - 1;
/*  591 */     this.j[paramInt].remove(paramsa);
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3) {
/*  595 */     return paramInt2 >= this.f[(paramInt3 << 4 | paramInt1)];
/*      */   }
/*      */   
/*      */   public aor e(int paramInt1, int paramInt2, int paramInt3) {
/*  599 */     agt localagt = new agt(paramInt1, paramInt2, paramInt3);
/*      */     
/*  601 */     aor localaor = (aor)this.i.get(localagt);
/*  602 */     if (localaor == null) {
/*  603 */       aji localaji = a(paramInt1, paramInt2, paramInt3);
/*  604 */       if (!localaji.u()) { return null;
/*      */       }
/*  606 */       localaor = ((akw)localaji).a(this.e, c(paramInt1, paramInt2, paramInt3));
/*  607 */       this.e.a(this.g * 16 + paramInt1, paramInt2, this.h * 16 + paramInt3, localaor);
/*      */     }
/*  609 */     if ((localaor != null) && (localaor.r())) {
/*  610 */       this.i.remove(localagt);
/*  611 */       return null;
/*      */     }
/*      */     
/*  614 */     return localaor;
/*      */   }
/*      */   
/*      */   public void a(aor paramaor) {
/*  618 */     int i1 = paramaor.c - this.g * 16;
/*  619 */     int i2 = paramaor.d;
/*  620 */     int i3 = paramaor.e - this.h * 16;
/*  621 */     a(i1, i2, i3, paramaor);
/*  622 */     if (this.d) {
/*  623 */       this.e.g.add(paramaor);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, aor paramaor) {
/*  628 */     agt localagt = new agt(paramInt1, paramInt2, paramInt3);
/*      */     
/*  630 */     paramaor.a(this.e);
/*  631 */     paramaor.c = (this.g * 16 + paramInt1);
/*  632 */     paramaor.d = paramInt2;
/*  633 */     paramaor.e = (this.h * 16 + paramInt3);
/*      */     
/*  635 */     if (!(a(paramInt1, paramInt2, paramInt3) instanceof akw)) {
/*  636 */       return;
/*      */     }
/*  638 */     if (this.i.containsKey(localagt)) {
/*  639 */       ((aor)this.i.get(localagt)).s();
/*      */     }
/*      */     
/*  642 */     paramaor.t();
/*  643 */     this.i.put(localagt, paramaor);
/*      */   }
/*      */   
/*      */   public void f(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  648 */     agt localagt = new agt(paramInt1, paramInt2, paramInt3);
/*      */     
/*  650 */     if (this.d) {
/*  651 */       aor localaor = (aor)this.i.remove(localagt);
/*  652 */       if (localaor != null) {
/*  653 */         localaor.s();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void c() {
/*  659 */     this.d = true;
/*  660 */     this.e.a(this.i.values());
/*  661 */     for (int i1 = 0; i1 < this.j.length; i1++) {
/*  662 */       for (sa localsa : this.j[i1]) {
/*  663 */         localsa.X();
/*      */       }
/*  665 */       this.e.a(this.j[i1]);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d() {
/*  670 */     this.d = false;
/*  671 */     for (aor localaor : this.i.values()) {
/*  672 */       this.e.a(localaor);
/*      */     }
/*  674 */     for (int i1 = 0; i1 < this.j.length; i1++) {
/*  675 */       this.e.b(this.j[i1]);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e() {
/*  680 */     this.n = true;
/*      */   }
/*      */   
/*      */   public void a(sa paramsa, azt paramazt, List paramList, sj paramsj) {
/*  684 */     int i1 = qh.c((paramazt.b - 2.0D) / 16.0D);
/*  685 */     int i2 = qh.c((paramazt.e + 2.0D) / 16.0D);
/*  686 */     i1 = qh.a(i1, 0, this.j.length - 1);
/*  687 */     i2 = qh.a(i2, 0, this.j.length - 1);
/*      */     
/*  689 */     for (int i3 = i1; i3 <= i2; i3++) {
/*  690 */       List localList = this.j[i3];
/*  691 */       for (int i4 = 0; i4 < localList.size(); i4++) {
/*  692 */         sa localsa = (sa)localList.get(i4);
/*  693 */         if ((localsa != paramsa) && (localsa.C.b(paramazt)) && ((paramsj == null) || (paramsj.a(localsa)))) {
/*  694 */           paramList.add(localsa);
/*      */           
/*  696 */           sa[] arrayOfsa = localsa.at();
/*  697 */           if (arrayOfsa != null) {
/*  698 */             for (int i5 = 0; i5 < arrayOfsa.length; i5++) {
/*  699 */               localsa = arrayOfsa[i5];
/*  700 */               if ((localsa != paramsa) && (localsa.C.b(paramazt)) && ((paramsj == null) || (paramsj.a(localsa)))) {
/*  701 */                 paramList.add(localsa);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(Class paramClass, azt paramazt, List paramList, sj paramsj) {
/*  711 */     int i1 = qh.c((paramazt.b - 2.0D) / 16.0D);
/*  712 */     int i2 = qh.c((paramazt.e + 2.0D) / 16.0D);
/*  713 */     i1 = qh.a(i1, 0, this.j.length - 1);
/*  714 */     i2 = qh.a(i2, 0, this.j.length - 1);
/*      */     
/*  716 */     for (int i3 = i1; i3 <= i2; i3++) {
/*  717 */       List localList = this.j[i3];
/*  718 */       for (int i4 = 0; i4 < localList.size(); i4++) {
/*  719 */         sa localsa = (sa)localList.get(i4);
/*  720 */         if ((paramClass.isAssignableFrom(localsa.getClass())) && (localsa.C.b(paramazt)) && (
/*  721 */           (paramsj == null) || (paramsj.a(localsa)))) {
/*  722 */           paramList.add(localsa);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean a(boolean paramBoolean)
/*      */   {
/*  738 */     if (paramBoolean) {
/*  739 */       if (((this.o) && (this.e.I() != this.p)) || (this.n)) {
/*  740 */         return true;
/*      */       }
/*      */     }
/*  743 */     else if ((this.o) && (this.e.I() >= this.p + 600L)) { return true;
/*      */     }
/*      */     
/*  746 */     return this.n;
/*      */   }
/*      */   
/*      */   public Random a(long paramLong) {
/*  750 */     return new Random(this.e.H() + this.g * this.g * 4987142 + this.g * 5947611 + this.h * this.h * 4392871L + this.h * 389711 ^ paramLong);
/*      */   }
/*      */   
/*      */   public boolean g() {
/*  754 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(apu paramapu1, apu paramapu2, int paramInt1, int paramInt2)
/*      */   {
/*  771 */     if ((!this.k) && (paramapu1.a(paramInt1 + 1, paramInt2 + 1)) && (paramapu1.a(paramInt1, paramInt2 + 1)) && (paramapu1.a(paramInt1 + 1, paramInt2))) {
/*  772 */       paramapu1.a(paramapu2, paramInt1, paramInt2);
/*      */     }
/*  774 */     if ((paramapu1.a(paramInt1 - 1, paramInt2)) && (!paramapu1.d(paramInt1 - 1, paramInt2).k) && (paramapu1.a(paramInt1 - 1, paramInt2 + 1)) && (paramapu1.a(paramInt1, paramInt2 + 1)) && (paramapu1.a(paramInt1 - 1, paramInt2 + 1))) {
/*  775 */       paramapu1.a(paramapu2, paramInt1 - 1, paramInt2);
/*      */     }
/*  777 */     if ((paramapu1.a(paramInt1, paramInt2 - 1)) && (!paramapu1.d(paramInt1, paramInt2 - 1).k) && (paramapu1.a(paramInt1 + 1, paramInt2 - 1)) && (paramapu1.a(paramInt1 + 1, paramInt2 - 1)) && (paramapu1.a(paramInt1 + 1, paramInt2))) {
/*  778 */       paramapu1.a(paramapu2, paramInt1, paramInt2 - 1);
/*      */     }
/*  780 */     if ((paramapu1.a(paramInt1 - 1, paramInt2 - 1)) && (!paramapu1.d(paramInt1 - 1, paramInt2 - 1).k) && (paramapu1.a(paramInt1, paramInt2 - 1)) && (paramapu1.a(paramInt1 - 1, paramInt2))) {
/*  781 */       paramapu1.a(paramapu2, paramInt1 - 1, paramInt2 - 1);
/*      */     }
/*      */   }
/*      */   
/*      */   public int d(int paramInt1, int paramInt2) {
/*  786 */     int i1 = paramInt1 | paramInt2 << 4;
/*  787 */     int i2 = this.b[i1];
/*  788 */     if (i2 == 64537) {
/*  789 */       int i3 = h() + 15;
/*  790 */       i2 = -1;
/*  791 */       while ((i3 > 0) && (i2 == -1)) {
/*  792 */         aji localaji = a(paramInt1, i3, paramInt2);
/*  793 */         awt localawt = localaji.o();
/*  794 */         if ((!localawt.c()) && (!localawt.d())) {
/*  795 */           i3--;
/*      */         } else {
/*  797 */           i2 = i3 + 1;
/*      */         }
/*      */       }
/*  800 */       this.b[i1] = i2;
/*      */     }
/*      */     
/*  803 */     return i2;
/*      */   }
/*      */   
/*      */   public void b(boolean paramBoolean) {
/*  807 */     if ((this.w) && (!this.e.t.g) && (!paramBoolean)) {
/*  808 */       c(this.e.E);
/*      */     }
/*  810 */     this.m = true;
/*      */     
/*  812 */     if ((!this.l) && (this.k)) {
/*  813 */       p();
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean k() {
/*  818 */     return (this.m) && (this.k) && (this.l);
/*      */   }
/*      */   
/*      */   public agu l() {
/*  822 */     return new agu(this.g, this.h);
/*      */   }
/*      */   
/*      */   public boolean c(int paramInt1, int paramInt2) {
/*  826 */     if (paramInt1 < 0) {
/*  827 */       paramInt1 = 0;
/*      */     }
/*  829 */     if (paramInt2 >= 256) {
/*  830 */       paramInt2 = 255;
/*      */     }
/*  832 */     for (int i1 = paramInt1; i1 <= paramInt2; i1 += 16) {
/*  833 */       apz localapz = this.u[(i1 >> 4)];
/*  834 */       if ((localapz != null) && (!localapz.a())) {
/*  835 */         return false;
/*      */       }
/*      */     }
/*  838 */     return true;
/*      */   }
/*      */   
/*      */   public void a(apz[] paramArrayOfapz) {
/*  842 */     this.u = paramArrayOfapz;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
/*      */   {
/*  854 */     int i1 = 0;
/*      */     
/*  856 */     boolean bool = !this.e.t.g;
/*      */     Object localObject;
/*  858 */     for (int i2 = 0; i2 < this.u.length; i2++) {
/*  859 */       if ((paramInt1 & 1 << i2) != 0)
/*      */       {
/*  861 */         if (this.u[i2] == null) {
/*  862 */           this.u[i2] = new apz(i2 << 4, bool);
/*      */         }
/*  864 */         localObject = this.u[i2].g();
/*  865 */         System.arraycopy(paramArrayOfByte, i1, localObject, 0, localObject.length);
/*  866 */         i1 += localObject.length;
/*      */       }
/*  868 */       else if ((paramBoolean) && (this.u[i2] != null)) {
/*  869 */         this.u[i2] = null;
/*      */       }
/*      */     }
/*  872 */     for (i2 = 0; i2 < this.u.length; i2++) {
/*  873 */       if (((paramInt1 & 1 << i2) != 0) && (this.u[i2] != null)) {
/*  874 */         localObject = this.u[i2].j();
/*  875 */         System.arraycopy(paramArrayOfByte, i1, ((apv)localObject).a, 0, ((apv)localObject).a.length);
/*  876 */         i1 += ((apv)localObject).a.length;
/*      */       }
/*      */     }
/*  879 */     for (i2 = 0; i2 < this.u.length; i2++) {
/*  880 */       if (((paramInt1 & 1 << i2) != 0) && (this.u[i2] != null)) {
/*  881 */         localObject = this.u[i2].k();
/*  882 */         System.arraycopy(paramArrayOfByte, i1, ((apv)localObject).a, 0, ((apv)localObject).a.length);
/*  883 */         i1 += ((apv)localObject).a.length;
/*      */       }
/*      */     }
/*  886 */     if (bool) {
/*  887 */       for (i2 = 0; i2 < this.u.length; i2++) {
/*  888 */         if (((paramInt1 & 1 << i2) != 0) && (this.u[i2] != null)) {
/*  889 */           localObject = this.u[i2].l();
/*  890 */           System.arraycopy(paramArrayOfByte, i1, ((apv)localObject).a, 0, ((apv)localObject).a.length);
/*  891 */           i1 += ((apv)localObject).a.length;
/*      */         }
/*      */       }
/*      */     }
/*  895 */     for (i2 = 0; i2 < this.u.length; i2++) {
/*  896 */       if ((paramInt2 & 1 << i2) != 0) {
/*  897 */         if (this.u[i2] == null) {
/*  898 */           i1 += 2048;
/*      */         } else {
/*  900 */           localObject = this.u[i2].i();
/*  901 */           if (localObject == null) {
/*  902 */             localObject = this.u[i2].m();
/*      */           }
/*  904 */           System.arraycopy(paramArrayOfByte, i1, ((apv)localObject).a, 0, ((apv)localObject).a.length);
/*  905 */           i1 += ((apv)localObject).a.length;
/*      */         }
/*  907 */       } else if ((paramBoolean) && (this.u[i2] != null) && (this.u[i2].i() != null)) {
/*  908 */         this.u[i2].h();
/*      */       }
/*      */     }
/*  911 */     if (paramBoolean) {
/*  912 */       System.arraycopy(paramArrayOfByte, i1, this.v, 0, this.v.length);
/*  913 */       i1 += this.v.length;
/*      */     }
/*      */     
/*  916 */     for (i2 = 0; i2 < this.u.length; i2++) {
/*  917 */       if ((this.u[i2] != null) && ((paramInt1 & 1 << i2) != 0)) {
/*  918 */         this.u[i2].e();
/*      */       }
/*      */     }
/*      */     
/*  922 */     this.l = true;
/*  923 */     this.k = true;
/*  924 */     a();
/*  925 */     for (Iterator localIterator = this.i.values().iterator(); localIterator.hasNext();) { localObject = (aor)localIterator.next();
/*  926 */       ((aor)localObject).u();
/*      */     }
/*      */   }
/*      */   
/*      */   public ahu a(int paramInt1, int paramInt2, aib paramaib) {
/*  931 */     int i1 = this.v[(paramInt2 << 4 | paramInt1)] & 0xFF;
/*  932 */     if (i1 == 255) {
/*  933 */       ahu localahu = paramaib.a((this.g << 4) + paramInt1, (this.h << 4) + paramInt2);
/*  934 */       i1 = localahu.ay;
/*  935 */       this.v[(paramInt2 << 4 | paramInt1)] = ((byte)(i1 & 0xFF));
/*      */     }
/*  937 */     if (ahu.d(i1) == null) {
/*  938 */       return ahu.p;
/*      */     }
/*  940 */     return ahu.d(i1);
/*      */   }
/*      */   
/*      */   public byte[] m() {
/*  944 */     return this.v;
/*      */   }
/*      */   
/*      */   public void a(byte[] paramArrayOfByte) {
/*  948 */     this.v = paramArrayOfByte;
/*      */   }
/*      */   
/*      */   public void n() {
/*  952 */     this.x = 0;
/*      */   }
/*      */   
/*      */   public void o() {
/*  956 */     for (int i1 = 0; i1 < 8; i1++) {
/*  957 */       if (this.x >= 4096) {
/*  958 */         return;
/*      */       }
/*      */       
/*  961 */       int i2 = this.x % 16;
/*  962 */       int i3 = this.x / 16 % 16;
/*  963 */       int i4 = this.x / 256;
/*  964 */       this.x += 1;
/*      */       
/*  966 */       int i5 = (this.g << 4) + i3;
/*  967 */       int i6 = (this.h << 4) + i4;
/*      */       
/*  969 */       for (int i7 = 0; i7 < 16; i7++) {
/*  970 */         int i8 = (i2 << 4) + i7;
/*  971 */         if (((this.u[i2] == null) && ((i7 == 0) || (i7 == 15) || (i3 == 0) || (i3 == 15) || (i4 == 0) || (i4 == 15))) || ((this.u[i2] != null) && (this.u[i2].a(i3, i7, i4).o() == awt.a)))
/*      */         {
/*  973 */           if (this.e.a(i5, i8 - 1, i6).m() > 0) {
/*  974 */             this.e.t(i5, i8 - 1, i6);
/*      */           }
/*  976 */           if (this.e.a(i5, i8 + 1, i6).m() > 0) {
/*  977 */             this.e.t(i5, i8 + 1, i6);
/*      */           }
/*  979 */           if (this.e.a(i5 - 1, i8, i6).m() > 0) {
/*  980 */             this.e.t(i5 - 1, i8, i6);
/*      */           }
/*  982 */           if (this.e.a(i5 + 1, i8, i6).m() > 0) {
/*  983 */             this.e.t(i5 + 1, i8, i6);
/*      */           }
/*  985 */           if (this.e.a(i5, i8, i6 - 1).m() > 0) {
/*  986 */             this.e.t(i5, i8, i6 - 1);
/*      */           }
/*  988 */           if (this.e.a(i5, i8, i6 + 1).m() > 0) {
/*  989 */             this.e.t(i5, i8, i6 + 1);
/*      */           }
/*  991 */           this.e.t(i5, i8, i6);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void p() {
/*  998 */     this.k = true;
/*  999 */     this.l = true;
/*      */     
/* 1001 */     if (!this.e.t.g) {
/* 1002 */       if (this.e.b(this.g * 16 - 1, 0, this.h * 16 - 1, this.g * 16 + 1, 63, this.h * 16 + 1))
/*      */       {
/* 1004 */         for (int i1 = 0; i1 < 16; i1++) {
/* 1005 */           for (int i2 = 0; i2 < 16; i2++) {
/* 1006 */             if (!f(i1, i2)) {
/* 1007 */               this.l = false;
/* 1008 */               break;
/*      */             }
/*      */           }
/*      */         }
/* 1012 */         if (this.l)
/*      */         {
/* 1014 */           apx localapx = this.e.d(this.g * 16 - 1, this.h * 16);
/* 1015 */           localapx.a(3);
/*      */           
/*      */ 
/* 1018 */           localapx = this.e.d(this.g * 16 + 16, this.h * 16);
/* 1019 */           localapx.a(1);
/*      */           
/*      */ 
/* 1022 */           localapx = this.e.d(this.g * 16, this.h * 16 - 1);
/* 1023 */           localapx.a(0);
/*      */           
/*      */ 
/* 1026 */           localapx = this.e.d(this.g * 16, this.h * 16 + 16);
/* 1027 */           localapx.a(2);
/*      */         }
/*      */       }
/*      */       else {
/* 1031 */         this.l = false;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(int paramInt) {
/* 1037 */     if (!this.k) {
/*      */       return;
/*      */     }
/*      */     int i1;
/* 1041 */     if (paramInt == 3) {
/* 1042 */       for (i1 = 0; i1 < 16; i1++) {
/* 1043 */         f(15, i1);
/*      */       }
/* 1045 */     } else if (paramInt == 1) {
/* 1046 */       for (i1 = 0; i1 < 16; i1++) {
/* 1047 */         f(0, i1);
/*      */       }
/* 1049 */     } else if (paramInt == 0) {
/* 1050 */       for (i1 = 0; i1 < 16; i1++) {
/* 1051 */         f(i1, 15);
/*      */       }
/* 1053 */     } else if (paramInt == 2) {
/* 1054 */       for (i1 = 0; i1 < 16; i1++) {
/* 1055 */         f(i1, 0);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean f(int paramInt1, int paramInt2) {
/* 1061 */     int i1 = h();
/*      */     
/* 1063 */     int i2 = 0;
/* 1064 */     int i3 = 0;
/*      */     
/* 1066 */     for (int i4 = i1 + 16 - 1; (i4 > 63) || ((i4 > 0) && (i3 == 0)); i4--) {
/* 1067 */       int i5 = b(paramInt1, i4, paramInt2);
/*      */       
/* 1069 */       if ((i5 == 255) && (i4 < 63)) {
/* 1070 */         i3 = 1;
/*      */       }
/*      */       
/* 1073 */       if ((i2 == 0) && (i5 > 0)) {
/* 1074 */         i2 = 1;
/* 1075 */       } else if ((i2 != 0) && (i5 == 0))
/*      */       {
/* 1077 */         if (!this.e.t(this.g * 16 + paramInt1, i4, this.h * 16 + paramInt2)) {
/* 1078 */           return false;
/*      */         }
/*      */       }
/*      */     }
/* 1084 */     for (; 
/*      */         
/* 1084 */         i4 > 0; i4--) {
/* 1085 */       if (a(paramInt1, i4, paramInt2).m() > 0) {
/* 1086 */         this.e.t(this.g * 16 + paramInt1, i4, this.h * 16 + paramInt2);
/*      */       }
/*      */     }
/* 1089 */     return true;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */