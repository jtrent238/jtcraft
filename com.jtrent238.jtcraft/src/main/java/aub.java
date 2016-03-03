/*     */ import java.util.Random;
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
/*     */ public class aub
/*     */   extends aue
/*     */ {
/*  99 */   private boolean[] e = new boolean[4];
/*     */   
/*     */ 
/* 102 */   private static final qx[] i = { new qx(ade.i, 0, 1, 3, 3), new qx(ade.j, 0, 1, 5, 10), new qx(ade.k, 0, 2, 7, 15), new qx(ade.bC, 0, 1, 3, 2), new qx(ade.aS, 0, 4, 6, 20), new qx(ade.bh, 0, 3, 7, 16), new qx(ade.av, 0, 1, 1, 3), new qx(ade.bX, 0, 1, 1, 1), new qx(ade.bY, 0, 1, 1, 1), new qx(ade.bZ, 0, 1, 1, 1) };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public aub() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public aub(Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/* 124 */     super(paramRandom, paramInt1, 64, paramInt2, 21, 15, 21);
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 129 */     super.a(paramdh);
/* 130 */     paramdh.a("hasPlacedChest0", this.e[0]);
/* 131 */     paramdh.a("hasPlacedChest1", this.e[1]);
/* 132 */     paramdh.a("hasPlacedChest2", this.e[2]);
/* 133 */     paramdh.a("hasPlacedChest3", this.e[3]);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 138 */     super.b(paramdh);
/* 139 */     this.e[0] = paramdh.n("hasPlacedChest0");
/* 140 */     this.e[1] = paramdh.n("hasPlacedChest1");
/* 141 */     this.e[2] = paramdh.n("hasPlacedChest2");
/* 142 */     this.e[3] = paramdh.n("hasPlacedChest3");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean a(ahb paramahb, Random paramRandom, asv paramasv)
/*     */   {
/* 149 */     a(paramahb, paramasv, 0, -4, 0, this.a - 1, 0, this.c - 1, ajn.A, ajn.A, false);
/* 150 */     for (int j = 1; j <= 9; j++) {
/* 151 */       a(paramahb, paramasv, j, j, j, this.a - 1 - j, j, this.c - 1 - j, ajn.A, ajn.A, false);
/* 152 */       a(paramahb, paramasv, j + 1, j, j + 1, this.a - 2 - j, j, this.c - 2 - j, ajn.a, ajn.a, false);
/*     */     }
/* 154 */     for (j = 0; j < this.a; j++) {
/* 155 */       for (k = 0; k < this.c; k++) {
/* 156 */         m = -5;
/* 157 */         b(paramahb, ajn.A, 0, j, m, k, paramasv);
/*     */       }
/*     */     }
/*     */     
/* 161 */     j = a(ajn.bz, 3);
/* 162 */     int k = a(ajn.bz, 2);
/* 163 */     int m = a(ajn.bz, 0);
/* 164 */     int n = a(ajn.bz, 1);
/* 165 */     int i1 = 1;
/* 166 */     int i2 = 11;
/*     */     
/*     */ 
/* 169 */     a(paramahb, paramasv, 0, 0, 0, 4, 9, 4, ajn.A, ajn.a, false);
/* 170 */     a(paramahb, paramasv, 1, 10, 1, 3, 10, 3, ajn.A, ajn.A, false);
/* 171 */     a(paramahb, ajn.bz, j, 2, 10, 0, paramasv);
/* 172 */     a(paramahb, ajn.bz, k, 2, 10, 4, paramasv);
/* 173 */     a(paramahb, ajn.bz, m, 0, 10, 2, paramasv);
/* 174 */     a(paramahb, ajn.bz, n, 4, 10, 2, paramasv);
/* 175 */     a(paramahb, paramasv, this.a - 5, 0, 0, this.a - 1, 9, 4, ajn.A, ajn.a, false);
/* 176 */     a(paramahb, paramasv, this.a - 4, 10, 1, this.a - 2, 10, 3, ajn.A, ajn.A, false);
/* 177 */     a(paramahb, ajn.bz, j, this.a - 3, 10, 0, paramasv);
/* 178 */     a(paramahb, ajn.bz, k, this.a - 3, 10, 4, paramasv);
/* 179 */     a(paramahb, ajn.bz, m, this.a - 5, 10, 2, paramasv);
/* 180 */     a(paramahb, ajn.bz, n, this.a - 1, 10, 2, paramasv);
/*     */     
/*     */ 
/* 183 */     a(paramahb, paramasv, 8, 0, 0, 12, 4, 4, ajn.A, ajn.a, false);
/* 184 */     a(paramahb, paramasv, 9, 1, 0, 11, 3, 4, ajn.a, ajn.a, false);
/* 185 */     a(paramahb, ajn.A, 2, 9, 1, 1, paramasv);
/* 186 */     a(paramahb, ajn.A, 2, 9, 2, 1, paramasv);
/* 187 */     a(paramahb, ajn.A, 2, 9, 3, 1, paramasv);
/* 188 */     a(paramahb, ajn.A, 2, 10, 3, 1, paramasv);
/* 189 */     a(paramahb, ajn.A, 2, 11, 3, 1, paramasv);
/* 190 */     a(paramahb, ajn.A, 2, 11, 2, 1, paramasv);
/* 191 */     a(paramahb, ajn.A, 2, 11, 1, 1, paramasv);
/*     */     
/*     */ 
/* 194 */     a(paramahb, paramasv, 4, 1, 1, 8, 3, 3, ajn.A, ajn.a, false);
/* 195 */     a(paramahb, paramasv, 4, 1, 2, 8, 2, 2, ajn.a, ajn.a, false);
/* 196 */     a(paramahb, paramasv, 12, 1, 1, 16, 3, 3, ajn.A, ajn.a, false);
/* 197 */     a(paramahb, paramasv, 12, 1, 2, 16, 2, 2, ajn.a, ajn.a, false);
/*     */     
/*     */ 
/* 200 */     a(paramahb, paramasv, 5, 4, 5, this.a - 6, 4, this.c - 6, ajn.A, ajn.A, false);
/* 201 */     a(paramahb, paramasv, 9, 4, 9, 11, 4, 11, ajn.a, ajn.a, false);
/* 202 */     a(paramahb, paramasv, 8, 1, 8, 8, 3, 8, ajn.A, 2, ajn.A, 2, false);
/* 203 */     a(paramahb, paramasv, 12, 1, 8, 12, 3, 8, ajn.A, 2, ajn.A, 2, false);
/* 204 */     a(paramahb, paramasv, 8, 1, 12, 8, 3, 12, ajn.A, 2, ajn.A, 2, false);
/* 205 */     a(paramahb, paramasv, 12, 1, 12, 12, 3, 12, ajn.A, 2, ajn.A, 2, false);
/*     */     
/*     */ 
/* 208 */     a(paramahb, paramasv, 1, 1, 5, 4, 4, 11, ajn.A, ajn.A, false);
/* 209 */     a(paramahb, paramasv, this.a - 5, 1, 5, this.a - 2, 4, 11, ajn.A, ajn.A, false);
/* 210 */     a(paramahb, paramasv, 6, 7, 9, 6, 7, 11, ajn.A, ajn.A, false);
/* 211 */     a(paramahb, paramasv, this.a - 7, 7, 9, this.a - 7, 7, 11, ajn.A, ajn.A, false);
/* 212 */     a(paramahb, paramasv, 5, 5, 9, 5, 7, 11, ajn.A, 2, ajn.A, 2, false);
/* 213 */     a(paramahb, paramasv, this.a - 6, 5, 9, this.a - 6, 7, 11, ajn.A, 2, ajn.A, 2, false);
/* 214 */     a(paramahb, ajn.a, 0, 5, 5, 10, paramasv);
/* 215 */     a(paramahb, ajn.a, 0, 5, 6, 10, paramasv);
/* 216 */     a(paramahb, ajn.a, 0, 6, 6, 10, paramasv);
/* 217 */     a(paramahb, ajn.a, 0, this.a - 6, 5, 10, paramasv);
/* 218 */     a(paramahb, ajn.a, 0, this.a - 6, 6, 10, paramasv);
/* 219 */     a(paramahb, ajn.a, 0, this.a - 7, 6, 10, paramasv);
/*     */     
/*     */ 
/* 222 */     a(paramahb, paramasv, 2, 4, 4, 2, 6, 4, ajn.a, ajn.a, false);
/* 223 */     a(paramahb, paramasv, this.a - 3, 4, 4, this.a - 3, 6, 4, ajn.a, ajn.a, false);
/* 224 */     a(paramahb, ajn.bz, j, 2, 4, 5, paramasv);
/* 225 */     a(paramahb, ajn.bz, j, 2, 3, 4, paramasv);
/* 226 */     a(paramahb, ajn.bz, j, this.a - 3, 4, 5, paramasv);
/* 227 */     a(paramahb, ajn.bz, j, this.a - 3, 3, 4, paramasv);
/* 228 */     a(paramahb, paramasv, 1, 1, 3, 2, 2, 3, ajn.A, ajn.A, false);
/* 229 */     a(paramahb, paramasv, this.a - 3, 1, 3, this.a - 2, 2, 3, ajn.A, ajn.A, false);
/* 230 */     a(paramahb, ajn.bz, 0, 1, 1, 2, paramasv);
/* 231 */     a(paramahb, ajn.bz, 0, this.a - 2, 1, 2, paramasv);
/* 232 */     a(paramahb, ajn.U, 1, 1, 2, 2, paramasv);
/* 233 */     a(paramahb, ajn.U, 1, this.a - 2, 2, 2, paramasv);
/* 234 */     a(paramahb, ajn.bz, n, 2, 1, 2, paramasv);
/* 235 */     a(paramahb, ajn.bz, m, this.a - 3, 1, 2, paramasv);
/*     */     
/*     */ 
/* 238 */     a(paramahb, paramasv, 4, 3, 5, 4, 3, 18, ajn.A, ajn.A, false);
/* 239 */     a(paramahb, paramasv, this.a - 5, 3, 5, this.a - 5, 3, 17, ajn.A, ajn.A, false);
/* 240 */     a(paramahb, paramasv, 3, 1, 5, 4, 2, 16, ajn.a, ajn.a, false);
/* 241 */     a(paramahb, paramasv, this.a - 6, 1, 5, this.a - 5, 2, 16, ajn.a, ajn.a, false);
/* 242 */     for (int i3 = 5; i3 <= 17; i3 += 2) {
/* 243 */       a(paramahb, ajn.A, 2, 4, 1, i3, paramasv);
/* 244 */       a(paramahb, ajn.A, 1, 4, 2, i3, paramasv);
/* 245 */       a(paramahb, ajn.A, 2, this.a - 5, 1, i3, paramasv);
/* 246 */       a(paramahb, ajn.A, 1, this.a - 5, 2, i3, paramasv);
/*     */     }
/* 248 */     a(paramahb, ajn.L, i1, 10, 0, 7, paramasv);
/* 249 */     a(paramahb, ajn.L, i1, 10, 0, 8, paramasv);
/* 250 */     a(paramahb, ajn.L, i1, 9, 0, 9, paramasv);
/* 251 */     a(paramahb, ajn.L, i1, 11, 0, 9, paramasv);
/* 252 */     a(paramahb, ajn.L, i1, 8, 0, 10, paramasv);
/* 253 */     a(paramahb, ajn.L, i1, 12, 0, 10, paramasv);
/* 254 */     a(paramahb, ajn.L, i1, 7, 0, 10, paramasv);
/* 255 */     a(paramahb, ajn.L, i1, 13, 0, 10, paramasv);
/* 256 */     a(paramahb, ajn.L, i1, 9, 0, 11, paramasv);
/* 257 */     a(paramahb, ajn.L, i1, 11, 0, 11, paramasv);
/* 258 */     a(paramahb, ajn.L, i1, 10, 0, 12, paramasv);
/* 259 */     a(paramahb, ajn.L, i1, 10, 0, 13, paramasv);
/* 260 */     a(paramahb, ajn.L, i2, 10, 0, 10, paramasv);
/*     */     
/*     */ 
/* 263 */     for (i3 = 0; i3 <= this.a - 1; i3 += this.a - 1) {
/* 264 */       a(paramahb, ajn.A, 2, i3, 2, 1, paramasv);
/* 265 */       a(paramahb, ajn.L, i1, i3, 2, 2, paramasv);
/* 266 */       a(paramahb, ajn.A, 2, i3, 2, 3, paramasv);
/* 267 */       a(paramahb, ajn.A, 2, i3, 3, 1, paramasv);
/* 268 */       a(paramahb, ajn.L, i1, i3, 3, 2, paramasv);
/* 269 */       a(paramahb, ajn.A, 2, i3, 3, 3, paramasv);
/* 270 */       a(paramahb, ajn.L, i1, i3, 4, 1, paramasv);
/* 271 */       a(paramahb, ajn.A, 1, i3, 4, 2, paramasv);
/* 272 */       a(paramahb, ajn.L, i1, i3, 4, 3, paramasv);
/* 273 */       a(paramahb, ajn.A, 2, i3, 5, 1, paramasv);
/* 274 */       a(paramahb, ajn.L, i1, i3, 5, 2, paramasv);
/* 275 */       a(paramahb, ajn.A, 2, i3, 5, 3, paramasv);
/* 276 */       a(paramahb, ajn.L, i1, i3, 6, 1, paramasv);
/* 277 */       a(paramahb, ajn.A, 1, i3, 6, 2, paramasv);
/* 278 */       a(paramahb, ajn.L, i1, i3, 6, 3, paramasv);
/* 279 */       a(paramahb, ajn.L, i1, i3, 7, 1, paramasv);
/* 280 */       a(paramahb, ajn.L, i1, i3, 7, 2, paramasv);
/* 281 */       a(paramahb, ajn.L, i1, i3, 7, 3, paramasv);
/* 282 */       a(paramahb, ajn.A, 2, i3, 8, 1, paramasv);
/* 283 */       a(paramahb, ajn.A, 2, i3, 8, 2, paramasv);
/* 284 */       a(paramahb, ajn.A, 2, i3, 8, 3, paramasv);
/*     */     }
/* 286 */     for (i3 = 2; i3 <= this.a - 3; i3 += this.a - 3 - 2) {
/* 287 */       a(paramahb, ajn.A, 2, i3 - 1, 2, 0, paramasv);
/* 288 */       a(paramahb, ajn.L, i1, i3, 2, 0, paramasv);
/* 289 */       a(paramahb, ajn.A, 2, i3 + 1, 2, 0, paramasv);
/* 290 */       a(paramahb, ajn.A, 2, i3 - 1, 3, 0, paramasv);
/* 291 */       a(paramahb, ajn.L, i1, i3, 3, 0, paramasv);
/* 292 */       a(paramahb, ajn.A, 2, i3 + 1, 3, 0, paramasv);
/* 293 */       a(paramahb, ajn.L, i1, i3 - 1, 4, 0, paramasv);
/* 294 */       a(paramahb, ajn.A, 1, i3, 4, 0, paramasv);
/* 295 */       a(paramahb, ajn.L, i1, i3 + 1, 4, 0, paramasv);
/* 296 */       a(paramahb, ajn.A, 2, i3 - 1, 5, 0, paramasv);
/* 297 */       a(paramahb, ajn.L, i1, i3, 5, 0, paramasv);
/* 298 */       a(paramahb, ajn.A, 2, i3 + 1, 5, 0, paramasv);
/* 299 */       a(paramahb, ajn.L, i1, i3 - 1, 6, 0, paramasv);
/* 300 */       a(paramahb, ajn.A, 1, i3, 6, 0, paramasv);
/* 301 */       a(paramahb, ajn.L, i1, i3 + 1, 6, 0, paramasv);
/* 302 */       a(paramahb, ajn.L, i1, i3 - 1, 7, 0, paramasv);
/* 303 */       a(paramahb, ajn.L, i1, i3, 7, 0, paramasv);
/* 304 */       a(paramahb, ajn.L, i1, i3 + 1, 7, 0, paramasv);
/* 305 */       a(paramahb, ajn.A, 2, i3 - 1, 8, 0, paramasv);
/* 306 */       a(paramahb, ajn.A, 2, i3, 8, 0, paramasv);
/* 307 */       a(paramahb, ajn.A, 2, i3 + 1, 8, 0, paramasv);
/*     */     }
/* 309 */     a(paramahb, paramasv, 8, 4, 0, 12, 6, 0, ajn.A, 2, ajn.A, 2, false);
/* 310 */     a(paramahb, ajn.a, 0, 8, 6, 0, paramasv);
/* 311 */     a(paramahb, ajn.a, 0, 12, 6, 0, paramasv);
/* 312 */     a(paramahb, ajn.L, i1, 9, 5, 0, paramasv);
/* 313 */     a(paramahb, ajn.A, 1, 10, 5, 0, paramasv);
/* 314 */     a(paramahb, ajn.L, i1, 11, 5, 0, paramasv);
/*     */     
/*     */ 
/* 317 */     a(paramahb, paramasv, 8, -14, 8, 12, -11, 12, ajn.A, 2, ajn.A, 2, false);
/* 318 */     a(paramahb, paramasv, 8, -10, 8, 12, -10, 12, ajn.A, 1, ajn.A, 1, false);
/* 319 */     a(paramahb, paramasv, 8, -9, 8, 12, -9, 12, ajn.A, 2, ajn.A, 2, false);
/* 320 */     a(paramahb, paramasv, 8, -8, 8, 12, -1, 12, ajn.A, ajn.A, false);
/* 321 */     a(paramahb, paramasv, 9, -11, 9, 11, -1, 11, ajn.a, ajn.a, false);
/* 322 */     a(paramahb, ajn.au, 0, 10, -11, 10, paramasv);
/* 323 */     a(paramahb, paramasv, 9, -13, 9, 11, -13, 11, ajn.W, ajn.a, false);
/* 324 */     a(paramahb, ajn.a, 0, 8, -11, 10, paramasv);
/* 325 */     a(paramahb, ajn.a, 0, 8, -10, 10, paramasv);
/* 326 */     a(paramahb, ajn.A, 1, 7, -10, 10, paramasv);
/* 327 */     a(paramahb, ajn.A, 2, 7, -11, 10, paramasv);
/* 328 */     a(paramahb, ajn.a, 0, 12, -11, 10, paramasv);
/* 329 */     a(paramahb, ajn.a, 0, 12, -10, 10, paramasv);
/* 330 */     a(paramahb, ajn.A, 1, 13, -10, 10, paramasv);
/* 331 */     a(paramahb, ajn.A, 2, 13, -11, 10, paramasv);
/* 332 */     a(paramahb, ajn.a, 0, 10, -11, 8, paramasv);
/* 333 */     a(paramahb, ajn.a, 0, 10, -10, 8, paramasv);
/* 334 */     a(paramahb, ajn.A, 1, 10, -10, 7, paramasv);
/* 335 */     a(paramahb, ajn.A, 2, 10, -11, 7, paramasv);
/* 336 */     a(paramahb, ajn.a, 0, 10, -11, 12, paramasv);
/* 337 */     a(paramahb, ajn.a, 0, 10, -10, 12, paramasv);
/* 338 */     a(paramahb, ajn.A, 1, 10, -10, 13, paramasv);
/* 339 */     a(paramahb, ajn.A, 2, 10, -11, 13, paramasv);
/*     */     
/*     */ 
/* 342 */     for (i3 = 0; i3 < 4; i3++) {
/* 343 */       if (this.e[i3] == 0) {
/* 344 */         int i4 = p.a[i3] * 2;
/* 345 */         int i5 = p.b[i3] * 2;
/* 346 */         this.e[i3] = a(paramahb, paramasv, paramRandom, 10 + i4, -11, 10 + i5, qx.a(i, new qx[] { ade.bR.b(paramRandom) }), 2 + paramRandom.nextInt(5));
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 351 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */