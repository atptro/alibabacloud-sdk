# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class SegmentAnimalRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentAnimalResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentAnimalResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentAnimalResponseData(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentAnimalAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentHDBodyRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentHDBodyResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentHDBodyResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentHDBodyResponseData(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentHDBodyAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentSkyRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentSkyResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentSkyResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentSkyResponseData(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentSkyAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class GetAsyncJobResultRequest(TeaModel):
    def __init__(self, job_id=None):
        self.job_id = job_id

    def validate(self):
        self.validate_required(self.job_id, 'job_id')

    def to_map(self):
        result = {}
        result['JobId'] = self.job_id
        return result

    def from_map(self, map={}):
        self.job_id = map.get('JobId')
        return self


class GetAsyncJobResultResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = GetAsyncJobResultResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class GetAsyncJobResultResponseData(TeaModel):
    def __init__(self, error_code=None, error_message=None, job_id=None, result=None, status=None):
        self.error_code = error_code
        self.error_message = error_message
        self.job_id = job_id
        self.result = result
        self.status = status

    def validate(self):
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_message, 'error_message')
        self.validate_required(self.job_id, 'job_id')
        self.validate_required(self.result, 'result')
        self.validate_required(self.status, 'status')

    def to_map(self):
        result = {}
        result['ErrorCode'] = self.error_code
        result['ErrorMessage'] = self.error_message
        result['JobId'] = self.job_id
        result['Result'] = self.result
        result['Status'] = self.status
        return result

    def from_map(self, map={}):
        self.error_code = map.get('ErrorCode')
        self.error_message = map.get('ErrorMessage')
        self.job_id = map.get('JobId')
        self.result = map.get('Result')
        self.status = map.get('Status')
        return self


class SegmentFurnitureRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentFurnitureResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentFurnitureResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentFurnitureResponseDataElements(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentFurnitureResponseData(TeaModel):
    def __init__(self, elements=None):
        self.elements = []

    def validate(self):
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = SegmentFurnitureResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class SegmentFurnitureAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class RefineMaskRequest(TeaModel):
    def __init__(self, mask_image_url=None, image_url=None):
        self.mask_image_url = mask_image_url
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.mask_image_url, 'mask_image_url')
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['MaskImageURL'] = self.mask_image_url
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.mask_image_url = map.get('MaskImageURL')
        self.image_url = map.get('ImageURL')
        return self


class RefineMaskResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = RefineMaskResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class RefineMaskResponseDataElements(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class RefineMaskResponseData(TeaModel):
    def __init__(self, elements=None):
        self.elements = []

    def validate(self):
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = RefineMaskResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class RefineMaskAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None, mask_image_url=None):
        self.image_urlobject = image_urlobject
        self.mask_image_url = mask_image_url

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')
        self.validate_required(self.mask_image_url, 'mask_image_url')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        result['MaskImageURL'] = self.mask_image_url
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        self.mask_image_url = map.get('MaskImageURL')
        return self


class ParseFaceRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class ParseFaceResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = ParseFaceResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class ParseFaceResponseDataElements(TeaModel):
    def __init__(self, name=None, image_url=None):
        self.name = name
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['Name'] = self.name
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.name = map.get('Name')
        self.image_url = map.get('ImageURL')
        return self


class ParseFaceResponseData(TeaModel):
    def __init__(self, origin_image_url=None, elements=None):
        self.origin_image_url = origin_image_url
        self.elements = []

    def validate(self):
        self.validate_required(self.origin_image_url, 'origin_image_url')
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['OriginImageURL'] = self.origin_image_url
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.origin_image_url = map.get('OriginImageURL')
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = ParseFaceResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class ParseFaceAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentVehicleRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentVehicleResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentVehicleResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentVehicleResponseDataElements(TeaModel):
    def __init__(self, origin_image_url=None, image_url=None):
        self.origin_image_url = origin_image_url
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.origin_image_url, 'origin_image_url')
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['OriginImageURL'] = self.origin_image_url
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.origin_image_url = map.get('OriginImageURL')
        self.image_url = map.get('ImageURL')
        return self


class SegmentVehicleResponseData(TeaModel):
    def __init__(self, elements=None):
        self.elements = []

    def validate(self):
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = SegmentVehicleResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class SegmentVehicleAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentHairRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentHairResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentHairResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentHairResponseDataElements(TeaModel):
    def __init__(self, image_url=None, x=None, y=None, width=None, height=None):
        self.image_url = image_url
        self.x = x
        self.y = y
        self.width = width
        self.height = height

    def validate(self):
        self.validate_required(self.image_url, 'image_url')
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.width, 'width')
        self.validate_required(self.height, 'height')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        result['X'] = self.x
        result['Y'] = self.y
        result['Width'] = self.width
        result['Height'] = self.height
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        self.x = map.get('X')
        self.y = map.get('Y')
        self.width = map.get('Width')
        self.height = map.get('Height')
        return self


class SegmentHairResponseData(TeaModel):
    def __init__(self, elements=None):
        self.elements = []

    def validate(self):
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = SegmentHairResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class SegmentHairAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentFaceRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentFaceResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentFaceResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentFaceResponseDataElements(TeaModel):
    def __init__(self, image_url=None, x=None, y=None, width=None, height=None):
        self.image_url = image_url
        self.x = x
        self.y = y
        self.width = width
        self.height = height

    def validate(self):
        self.validate_required(self.image_url, 'image_url')
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.width, 'width')
        self.validate_required(self.height, 'height')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        result['X'] = self.x
        result['Y'] = self.y
        result['Width'] = self.width
        result['Height'] = self.height
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        self.x = map.get('X')
        self.y = map.get('Y')
        self.width = map.get('Width')
        self.height = map.get('Height')
        return self


class SegmentFaceResponseData(TeaModel):
    def __init__(self, elements=None):
        self.elements = []

    def validate(self):
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = SegmentFaceResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class SegmentFaceAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentHeadRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentHeadResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentHeadResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentHeadResponseDataElements(TeaModel):
    def __init__(self, image_url=None, x=None, y=None, width=None, height=None):
        self.image_url = image_url
        self.x = x
        self.y = y
        self.width = width
        self.height = height

    def validate(self):
        self.validate_required(self.image_url, 'image_url')
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.width, 'width')
        self.validate_required(self.height, 'height')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        result['X'] = self.x
        result['Y'] = self.y
        result['Width'] = self.width
        result['Height'] = self.height
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        self.x = map.get('X')
        self.y = map.get('Y')
        self.width = map.get('Width')
        self.height = map.get('Height')
        return self


class SegmentHeadResponseData(TeaModel):
    def __init__(self, elements=None):
        self.elements = []

    def validate(self):
        self.validate_required(self.elements, 'elements')
        if self.elements:
            for k in self.elements:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['Elements'] = []
        if self.elements is not None:
            for k in self.elements:
                result['Elements'].append(k.to_map() if k else None)
        else:
            result['Elements'] = None
        return result

    def from_map(self, map={}):
        self.elements = []
        if map.get('Elements') is not None:
            for k in map.get('Elements'):
                temp_model = SegmentHeadResponseDataElements()
                temp_model = temp_model.from_map(k)
                self.elements.append(temp_model)
        else:
            self.elements = None
        return self


class SegmentHeadAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentCommodityRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentCommodityResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentCommodityResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentCommodityResponseData(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentCommodityAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self


class SegmentBodyRequest(TeaModel):
    def __init__(self, image_url=None, async=None):
        self.image_url = image_url
        self.async = async

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        result['Async'] = self.async
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        self.async = map.get('Async')
        return self


class SegmentBodyResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentBodyResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentBodyResponseData(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentBodyAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None, async=None):
        self.image_urlobject = image_urlobject
        self.async = async

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        result['Async'] = self.async
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        self.async = map.get('Async')
        return self


class SegmentCommonImageRequest(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentCommonImageResponse(TeaModel):
    def __init__(self, request_id=None, data=None):
        self.request_id = request_id
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        if self.data is not None:
            result['Data'] = self.data.to_map()
        else:
            result['Data'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        if map.get('Data') is not None:
            temp_model = SegmentCommonImageResponseData()
            self.data = temp_model.from_map(map['Data'])
        else:
            self.data = None
        return self


class SegmentCommonImageResponseData(TeaModel):
    def __init__(self, image_url=None):
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        result = {}
        result['ImageURL'] = self.image_url
        return result

    def from_map(self, map={}):
        self.image_url = map.get('ImageURL')
        return self


class SegmentCommonImageAdvanceRequest(TeaModel):
    def __init__(self, image_urlobject=None):
        self.image_urlobject = image_urlobject

    def validate(self):
        self.validate_required(self.image_urlobject, 'image_urlobject')

    def to_map(self):
        result = {}
        result['ImageURLObject'] = self.image_urlobject
        return result

    def from_map(self, map={}):
        self.image_urlobject = map.get('ImageURLObject')
        return self
