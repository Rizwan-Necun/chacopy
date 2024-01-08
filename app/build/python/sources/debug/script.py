import cv2
import os
def gray_sca(image_path,output_path):
    img = cv2.imread(image_path, 0)
    if not os.path.exists(output_path):
        os.makedirs(output_path)
    output_path = os.path.join(output_path, 'grayscale_tomatoes.jpg')
    cv2.imwrite(output_path, img)


# gray("inputimages\\2.jpeg","black")

